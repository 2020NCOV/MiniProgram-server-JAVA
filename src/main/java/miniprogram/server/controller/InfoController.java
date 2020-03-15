package miniprogram.server.controller;

import com.alibaba.fastjson.JSONObject;
import miniprogram.server.beans.Organization;
import miniprogram.server.beans.WxMpUser;
import miniprogram.server.service.OrganizationService;
import miniprogram.server.service.WxMpBindInfoService;
import miniprogram.server.service.WxMpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index/info")
public class InfoController {

    @Autowired
    WxMpUserService wxMpUserService;

    @Autowired
    OrganizationService organizationService;

    @Autowired
    WxMpBindInfoService wxMpBindInfoService;

    /**
     * {
     * "errcode":0,
     * "userid":"12",
     * "name":"张三",
     * "corpname":"学校名称",
     * "phone_num":"13444444444"
     * }
     *
     * @param uid
     * @param token
     * @param corpid
     * @return
     */
    @PostMapping(value = "getmyinfo")
    public JSONObject getMyInfo(Integer uid, String token, Integer corpid) {
        System.out.println("method----------------------getMyInfo");
        JSONObject data = new JSONObject();

        if (uid == null || token == null || corpid == null) {
            data.put("errcode", 1003);
            data.put("msg", "参数错误");
            return data;
        }

        Organization organization = organizationService.selectByCorpCode(corpid);
        if (organization != null) {
            Organization bindOrg = wxMpBindInfoService.selectByOrgId(uid);
            if (bindOrg == null) {
                data.put("errcode", 1005);
                data.put("msg", "获取用户绑定信息失败，未绑定任何机构!");
                return data;
            }

            if (!organization.getId().equals(bindOrg.getId())) {
                data.put("errcode", 1099);
                data.put("corp_code", bindOrg.getId());
                data.put("bind_corp_name", bindOrg.getCorpname());
                data.put("cur_corp_name", organization.getCorpname());
                data.put("msg", "您尚未绑定" + organization.getCorpname() + ",请先从" + bindOrg.getCorpname() + "解绑后再绑定");
                return data;
            }

            WxMpUser wxMpUser = wxMpUserService.selectByWid(uid);
            if (wxMpUser != null) {
                data.put("errcode", 0);
                data.put("userid", wxMpUser.getUserid());
                data.put("name", wxMpUser.getName());
                data.put("phone_num", wxMpUser.getPhoneNum());
                data.put("corpname", organization.getCorpname());
                data.put("type_corpname", organization.getTypeCorpname());
                data.put("type_username", organization.getTypeUsername());
                return data;
            } else {
                data.put("errcode", 1005);
                data.put("msg", "获取用户信息失败");
                return data;
            }

        } else {
            data.put("errcode", 10006);
            data.put("msg", "获取企业信息失败");
            return data;
        }
    }

    /**
     * {
     * "errcode ": 0,
     * 'is_bind':1, (1代表已绑定某个企业，0代表未绑定任何企业)
     * 'corp_code':''10000lxxl'''
     * }
     *
     * @param uid
     * @param token
     * @return
     */
    @PostMapping(value = "getbindinfo")
    public JSONObject getbindinfo(Integer uid, String token) {
        System.out.println("method----------------------getbindinfo");
        JSONObject data = new JSONObject();
        data.put("errcode", 0);
        data.put("is_bind", 1);
        data.put("corp_code", "10000lxxl");
        return data;
    }


}
