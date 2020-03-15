package miniprogram.server.controller;

import com.alibaba.fastjson.JSONObject;
import miniprogram.server.beans.Organization;
import miniprogram.server.beans.WxMpBindInfo;
import miniprogram.server.beans.WxMpUser;
import miniprogram.server.service.OrganizationService;
import miniprogram.server.service.WxMpBindInfoService;
import miniprogram.server.service.WxMpUserService;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/index/login")
public class LoginController {

    @Autowired
    WxMpUserService wxMpUserService;

    @Autowired
    OrganizationService organizationService;

    @Autowired
    WxMpBindInfoService wxMpBindInfoService;

//    @Autowired
//    private AllService allService;

    @PostMapping(value = "getcode")
    public JSONObject getCode(String code, String corpid, String type) {
        System.out.println("method----------------------getCode");

        String appid  = "";
        String secret = "";

        String getTokenUrl = "https://api.weixin.qq.com/cgi-bin/token?appid=" + appid + "&secret=" + secret + "&grant_type=client_credential";
        JSONObject tokenJO = doGetRequest(getTokenUrl);

        String getOpenIDUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" + secret + "&js_code=" + code + "&grant_type=authorization_code";
        JSONObject openIDJO = doGetRequest(getOpenIDUrl);

        WxMpUser wxMpUser = new WxMpUser();
        wxMpUser.setToken(tokenJO.getString("access_token"));
        wxMpUser.setOpenid(openIDJO.getString("openid"));
        wxMpUser.setSessionKey(openIDJO.getString("session_key"));
        wxMpUserService.insert(wxMpUser);

        JSONObject data = new JSONObject();
        data.put("errcode", 0);
        data.put("token", wxMpUser.getToken());
        data.put("uid", wxMpUser.getWid());
        data.put("is_registered", 0);
        return data;
    }

    /**
     * {
     * "errcode": 0,
     * "is_registered": 0
     * }
     *
     * @param code
     * @param corpid
     * @param uid
     * @return
     */
    @PostMapping(value = "check_is_registered")
    public JSONObject checkIsRegistered(String code, Integer corpid, Integer uid) {
        System.out.println("method----------------------checkIsRegistered");
        JSONObject data = new JSONObject();
        Organization organization = organizationService.selectByCorpCode(corpid);
        if (organization != null) {
            WxMpBindInfo param = new WxMpBindInfo();
            param.setWxUid(uid);
            param.setOrgId(corpid);
            param.setIsbind(1);
            WxMpBindInfo wxMpBindInfo = wxMpBindInfoService.select(param);
            if (wxMpBindInfo != null) {
                data.put("is_registered", 1);
            } else {
                data.put("is_registered", 0);
            }
            data.put("errcode", 0);
            return data;
        } else {
            data.put("errcode", 10006);
            data.put("msg", "获取企业信息失败");
            return data;
        }
    }

    /**
     * {
     * "errcode": 0,
     * "corpid": "202010013742",
     * "corpname": '学校名称',
     * "template_code": 'default',
     * "type_corpname": '公司名称',
     * "type_username": '职工号',
     * }
     *
     * @param uid
     * @param token
     * @param corpid
     * @param template_code
     * @return
     */
    @PostMapping(value = "getcorpname")
    public JSONObject getcorpname(Integer uid, String token, Integer corpid, String template_code) {
        System.out.println("method----------------------getcorpname");
        JSONObject data = new JSONObject();
        Organization organization = organizationService.selectByCorpCode(corpid);
        if (organization != null) {
            data.put("errcode", 0);
            data.put("corpid", organization.getCorpCode());
            data.put("corpname", organization.getCorpname());
            data.put("template_code", organization.getTemplateCode());
            data.put("type_corpname", organization.getTypeCorpname());
            data.put("type_username", organization.getTypeUsername());
        } else {
            data.put("errcode", 1);
            data.put("msg", "查无数据");
        }
        return data;
    }


    /**
     * {
     * "errcode": 0,
     * "corpid": "202010013742",
     * "userid": 'A010002',
     * "is_exist": 0
     * }
     *
     * @param uid
     * @param token
     * @param corpid
     * @param userid
     * @return
     */
    @PostMapping(value = "check_user")
    public JSONObject checkUser(Integer uid, String token, Integer corpid, String userid) {
        System.out.println("method----------------------checkUser");
        JSONObject data = new JSONObject();

        Organization organization = organizationService.selectByCorpCode(corpid);
        if (organization != null) {
            WxMpBindInfo param = new WxMpBindInfo();
            param.setOrgId(corpid);
            param.setUsername(userid);
            param.setIsbind(1);
            WxMpBindInfo result = wxMpBindInfoService.select(param);
            if (result != null) {
                if (result.getIsbind() == 0) {
                    data.put("errcode", 0);
                    data.put("corpid", result.getOrgId());
                    data.put("userid", result.getUsername());
                    data.put("is_exist", 0);
                    return data;
                } else {
                    data.put("errcode", 100020);
                    data.put("msg", "该用户已被其他微信绑定，每个用户只能被一个微信绑定");
                    return data;
                }
            }

        } else {
            data.put("errcode", 10006);
            data.put("msg", "获取企业信息失败");
            return data;
        }

        data.put("errcode", 0);
        data.put("corpid", corpid);
        data.put("userid", userid);
        data.put("is_exist", 0);
        return data;
    }

    /**
     * uid: app.globalData.uid,
     * token: app.globalData.token,
     * corpid: that.data.corpid,
     * userid: that.data.userid,
     * password: e.detail.value.password.trim()
     */
    @PostMapping(value = "bind")
    public JSONObject bind(Integer uid, String token, Integer corpid, String userid, String password) {
        System.out.println("method----------------------bind");
        JSONObject data = new JSONObject();
        //判断用户是否已注册
        WxMpUser wxMpUser = wxMpUserService.selectByUserid(userid);
        if (wxMpUser == null) {
            data.put("errcode", 0);
            data.put("is_registered", 0);
            return data;
        }

        WxMpBindInfo param = new WxMpBindInfo();
        param.setUsername(userid);
        param.setIsbind(1);
        WxMpBindInfo checkIsBind = wxMpBindInfoService.select(param);
        if (checkIsBind == null) {
            Date date = new Date();
            System.out.println(date);
            WxMpBindInfo wxMpBindInfo = new WxMpBindInfo();
            wxMpBindInfo.setWxUid(uid);
            wxMpBindInfo.setOrgId(corpid);
            wxMpBindInfo.setUsername(userid);
            wxMpBindInfo.setIsbind(1);
            wxMpBindInfo.setBindDate(date);
            wxMpBindInfoService.insert(wxMpBindInfo);
        }
        data.put("errcode", 0);
        data.put("is_registered", 2);
        return data;
    }

    /**
     * {
     * "errcode ": 0,
     * "is_registered ": 1,
     * }
     *
     * @param uid
     * @param token
     * @param corpid
     * @param userid
     * @param name
     * @param phone_num
     * @return
     */
    @PostMapping(value = "register")
    public JSONObject register(Integer uid, String token, Integer corpid, String userid, String name, String phone_num) {
        System.out.println("method----------------------register");
        JSONObject data = new JSONObject();

//        WxMpBindInfo wxMpBindInfo = wxMpBindInfoService.isBindByParam(uid, corpid, userid);
        //检查是否已注册
        WxMpBindInfo param = new WxMpBindInfo();
        param.setWxUid(uid);
        param.setOrgId(corpid);
        param.setUsername(userid);
        param.setIsbind(1);
        WxMpBindInfo check = wxMpBindInfoService.select(param);

        if (check != null) {
            data.put("errcode", 0);
            data.put("is_registered", 1);
            return data;
        } else {
            param.setOrgId(null);
            //此处检查一个微信，只能绑定一个企业
            WxMpBindInfo wxMpBindInfo2 = wxMpBindInfoService.select(param);
            if (wxMpBindInfo2 != null) {
                data.put("errcode", 100020);
                data.put("is_registered", "本微信已经绑定其他机构，不能重复绑定");
                return data;
            }

            WxMpUser wxMpUser = new WxMpUser();
            wxMpUser.setWid(uid);
            wxMpUser.setUserid(userid);
            wxMpUser.setName(name);
            wxMpUser.setPhoneNum(phone_num);
            wxMpUserService.update(wxMpUser);

            WxMpBindInfo wxMpBindInfo = new WxMpBindInfo();
            wxMpBindInfo.setWxUid(uid);
            wxMpBindInfo.setOrgId(corpid);
            wxMpBindInfo.setUsername(userid);
            wxMpBindInfo.setIsbind(1);
            wxMpBindInfoService.insert(wxMpBindInfo);

            data.put("errcode", 0);
            data.put("is_registered", 1);
            return data;
        }
    }

    @PostMapping(value = "unbind")
    public JSONObject unbind(Integer uid, String token){
        System.out.println("method----------------------unbind");

        wxMpBindInfoService.updateStatus(uid);

        JSONObject data = new JSONObject();
        data.put("errcode", 0);
        data.put("is_registered", 0);
        return data;
    }


    private JSONObject doGetRequest(String url) {
        JSONObject jo = new JSONObject();
        //1.生成HttpClient对象并设置参数
        HttpClient httpClient = new HttpClient();
        //设置Http连接超时为5秒
        httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(5000);

        //2.生成GetMethod对象并设置参数
        GetMethod getMethod = new GetMethod(url);
        //设置get请求超时为5秒
        getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 5000);
        //设置请求重试处理，用的是默认的重试处理：请求三次
//        getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());

        try {
            //3.执行HTTP GET 请求
            int statusCode = httpClient.executeMethod(getMethod);

            //4.判断访问的状态码
            if (statusCode != HttpStatus.SC_OK) {
                System.err.println("请求出错：" + getMethod.getStatusLine());
            }

            //5.处理HTTP响应内容
            //读取HTTP响应内容，这里简单打印网页内容
            //读取为字节数组
            byte[] responseBody = getMethod.getResponseBody();
            jo = JSONObject.parseObject(new String(responseBody, "UTF-8"));
            System.out.println("-----------response:" + jo);
            //读取为InputStream，在网页内容数据量大时候推荐使用
            //InputStream response = getMethod.getResponseBodyAsStream();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6.释放连接
            getMethod.releaseConnection();
        }
        return jo;
    }


}
