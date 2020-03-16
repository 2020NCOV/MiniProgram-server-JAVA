package miniprogram.server.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import miniprogram.server.beans.Organization;
import miniprogram.server.beans.ReportRecordDefault;
import miniprogram.server.beans.WxMpUser;
import miniprogram.server.service.OrganizationService;
import miniprogram.server.service.ReportRecordDefaultService;
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

    @Autowired
    ReportRecordDefaultService reportRecordDefaultService;

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
        WxMpUser wxMpUser = wxMpUserService.selectByWid(uid);
        String name = wxMpUser.getName();
        ReportRecordDefault reportRecordDefault = reportRecordDefaultService.selectLastByName(name);

        if (reportRecordDefault == null) {
            data.put("errcode", 0);
            data.put("isEmpty", 1);
            data.put("data", "");
            return data;
        } else {
//            String jsonString = JSON.toJSONString(reportRecordDefault);
//            System.out.println(jsonString);
//            JSONObject jo = JSONObject.parseObject(jsonString);
            //序列化没做好，未来考虑改进
            JSONObject jo = new JSONObject();
            jo.put("id", reportRecordDefault.getId());
            jo.put("wxuid", reportRecordDefault.getWxuid());
            jo.put("org_id", reportRecordDefault.getOrgId());
            jo.put("org_name", reportRecordDefault.getOrgName());
            jo.put("userID", reportRecordDefault.getUserid());
            jo.put("name", reportRecordDefault.getName());
            jo.put("is_return_school", reportRecordDefault.getIsReturnSchool());
            jo.put("return_dorm_num", reportRecordDefault.getReturnDormNum());
            jo.put("return_time", reportRecordDefault.getReturnTime());
            jo.put("return_district_value", reportRecordDefault.getReturnDistrictValue());
            jo.put("return_district_path", reportRecordDefault.getReturnDistrictPath());
            jo.put("return_traffic_info", reportRecordDefault.getReturnTrafficInfo());
            jo.put("current_district_value", reportRecordDefault.getCurrentDistrictValue());
            jo.put("current_district_path", reportRecordDefault.getCurrentDistrictPath());
            jo.put("current_health_value", reportRecordDefault.getCurrentHealthValue());
            jo.put("current_contagion_risk_value", reportRecordDefault.getCurrentContagionRiskValue());
            jo.put("current_temperature", reportRecordDefault.getCurrentTemperature());
            jo.put("psy_status", reportRecordDefault.getPsyStatus());
            jo.put("psy_demand", reportRecordDefault.getPsyDemand());
            jo.put("psy_knowledge", reportRecordDefault.getPsyKnowledge());
            jo.put("return_company_date", reportRecordDefault.getReturnCompanyDate());
            jo.put("plan_company_date", reportRecordDefault.getPlanCompanyDate());
            jo.put("template_code", reportRecordDefault.getTemplateCode());
            jo.put("remarks", reportRecordDefault.getRemarks());
            jo.put("time", reportRecordDefault.getTime());

            /**
             * {"errcode":0,"isEmpty":0,"data":{"id":2,"wxuid":1,"org_id":1,"org_name":"缺省学校名称","userID":"1900022750","name":"msq","is_return_school":2,"return_dorm_num":null,"return_time":null,"return_district_value":0,"return_district_path":"","return_traffic_info":null,"current_district_value":1101000,"current_district_path":"北京市,直辖区","current_health_value":5,"current_contagion_risk_value":7,"current_temperature":36.6,"psy_status":1,"psy_demand":5,"psy_knowledge":1,"return_company_date":null,"plan_company_date":"2020-03-15","template_code":"default","remarks":"","time":"2020-03-15 21:30:04"}}
             */
            data.put("errcode", 0);
            data.put("isEmpty", 0);
            data.put("data", jo);
            return data;
        }
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
    public JSONObject save(String data, Integer uid, String token, String template_code) {
        System.out.println("method----------------------save");
        Organization bindOrg = wxMpBindInfoService.selectByUserId(uid);
        WxMpUser wxMpUser = wxMpUserService.selectByWid(uid);

        //序列化没做好，未来考虑改进
        JSONObject jo = JSONObject.parseObject(data);
        ReportRecordDefault reportRecordDefault = new ReportRecordDefault();
        reportRecordDefault.setWxuid(uid);
        reportRecordDefault.setOrgId(bindOrg.getId());
        reportRecordDefault.setOrgName(bindOrg.getCorpname());
        reportRecordDefault.setUserid(wxMpUser.getUserid());
        reportRecordDefault.setName(wxMpUser.getName());
        reportRecordDefault.setIsReturnSchool(jo.getInteger("is_return_school"));
        reportRecordDefault.setReturnDormNum(jo.getString("return_dorm_num"));
        reportRecordDefault.setReturnTime(jo.getDate("return_time"));
        reportRecordDefault.setReturnDistrictValue(jo.getInteger("return_district_value"));
        reportRecordDefault.setReturnDistrictPath(jo.getString("return_district_path"));
        reportRecordDefault.setReturnTrafficInfo(jo.getString("return_traffic_info"));
        reportRecordDefault.setCurrentDistrictValue(jo.getInteger("current_district_value"));
        reportRecordDefault.setCurrentDistrictPath(jo.getString("current_district_path"));
        reportRecordDefault.setCurrentHealthValue(jo.getInteger("current_health_value"));
        reportRecordDefault.setCurrentContagionRiskValue(jo.getInteger("current_contagion_risk_value"));
        reportRecordDefault.setCurrentTemperature(jo.getFloat("current_temperature"));
        reportRecordDefault.setPsyStatus(jo.getInteger("psy_status"));
        reportRecordDefault.setPsyDemand(jo.getInteger("psy_demand"));
        reportRecordDefault.setPsyKnowledge(jo.getInteger("psy_knowledge"));
        reportRecordDefault.setReturnCompanyDate(jo.getString("return_company_date"));
        reportRecordDefault.setPlanCompanyDate(jo.getString("plan_company_date"));
        reportRecordDefault.setTemplateCode(template_code);
        reportRecordDefault.setRemarks(jo.getString("remarks"));
        reportRecordDefault.setTime(jo.getDate("time"));
        reportRecordDefaultService.insert(reportRecordDefault);

        JSONObject result = new JSONObject();
        result.put("errcode", 0);
        result.put("msg", "数据提交成功");
        return result;
    }

}
