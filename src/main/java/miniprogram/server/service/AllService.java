package miniprogram.server.service;

import miniprogram.server.utils.JSONRes;

import java.io.IOException;

public interface AllService {

    /**
     * @Description: getCode 用户登录函数，通过code、appid、appsecret获取openid和sessionkey（token），作为之后操作的验证
     * @return
     */
    public JSONRes getCode(String code) throws IOException;

}
