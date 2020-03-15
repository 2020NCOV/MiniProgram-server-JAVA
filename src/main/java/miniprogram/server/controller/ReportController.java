package miniprogram.server.controller;

import com.alibaba.fastjson.JSONObject;
import miniprogram.server.service.OrganizationService;
import miniprogram.server.service.WxMpBindInfoService;
import miniprogram.server.service.WxMpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index/report")
public class ReportController {
    @Autowired
    WxMpUserService wxMpUserService;

    @Autowired
    OrganizationService organizationService;

    @Autowired
    WxMpBindInfoService wxMpBindInfoService;


    /**
     * {
     * "errcode": 0,
     * "isEmpty": 0, (1代表没有记录， 0代表有记录)
     * "data":{}
     * }
     *
     * @param uid
     * @param token
     * @return
     */
    @PostMapping(value = "getlastdata")
    public JSONObject getLastData(Integer uid, String token) {
        System.out.println("method----------------------getLastData");
        JSONObject data = new JSONObject();
        data.put("errcode", 0);
        data.put("isEmpty", 0);
        data.put("data", "");
        return data;
    }

    /**
     * {
     * "errcode": 0,
     * "message": "数据提交成功"
     * }
     *
     * @param uid
     * @param token
     * @param template_code
     * @return
     */
    @PostMapping(value = "save")
    public JSONObject save(Integer uid, String token, String template_code) {
        System.out.println("method----------------------save");
        JSONObject data = new JSONObject();
        data.put("errcode", 0);
        data.put("message", "数据提交成功");
        return data;
    }

}
