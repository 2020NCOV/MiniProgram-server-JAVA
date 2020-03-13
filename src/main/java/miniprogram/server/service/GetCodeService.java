package miniprogram.server.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import miniprogram.server.utils.JSONRes;
import miniprogram.server.utils.OpenIdJson;
import miniprogram.server.mapper.WxMpUserMapper;
import miniprogram.server.utils.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Service
public class GetCodeService implements AllService {

    private String appID = "wx34f5a8a2d9f8ea70";
    private String appSecret = "1505ca8d129c74a05199b8180fcfeb48";

    @Autowired
    private WxMpUserMapper wxMpUserMapper;

    @Override
    public JSONRes getCode(@RequestParam("code") String code) throws IOException {
        String str = "";
        try{//请求微信服务器，用code换取openid。HttpUtil是工具类，后面会给出实现，Configure类是小程序配置信息，后面会给出代码
            str = HttpUtil.doGet(
                    "https://api.weixin.qq.com/sns/jscode2session?appid="
                            + this.appID + "&secret="
                            + this.appSecret + "&js_code="
                            + code
                            + "&grant_type=authorization_code", null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        assert str != null;
        OpenIdJson openIdJson = mapper.readValue(str,OpenIdJson.class);
        System.out.println(openIdJson);
        JSONRes res = new JSONRes(0, openIdJson.getOpenid(), 1);

        return res;

    }
}
