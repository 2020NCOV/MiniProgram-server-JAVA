package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "report_record_company")
public class ReportRecordCompany {
    @Id
    private Long id;

    /**
     * 微信小程序用户id
     */
    private Integer wxuid;

    /**
     * 机构id
     */
    @Column(name = "org_id")
    private Integer orgId;

    /**
     * 机构名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 用户标识码
     */
    @Column(name = "userID")
    private String userid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 	是否返校（选项值）
     */
    @Column(name = "is_return_school")
    private Integer isReturnSchool;

    /**
     * 所在宿舍号
     */
    @Column(name = "return_dorm_num")
    private String returnDormNum;

    /**
     * 返校时间（Unix时间戳-UTC时间）
     */
    @Column(name = "return_time")
    private Date returnTime;

    /**
     * 从哪里返回学校（行政区划字典值）
     */
    @Column(name = "return_district_value")
    private Integer returnDistrictValue;

    /**
     * 从哪里返回学校（从上级到下级按逗号分隔的字典值）
     */
    @Column(name = "return_district_path")
    private String returnDistrictPath;

    /**
     * 返校过程的交通信息
     */
    @Column(name = "return_traffic_info")
    private String returnTrafficInfo;

    /**
     * 目前所在地
     */
    @Column(name = "current_district_value")
    private Integer currentDistrictValue;

    /**
     * 目前所在地（从上级到下级按逗号分隔的字典值）
     */
    @Column(name = "current_district_path")
    private String currentDistrictPath;

    /**
     * 目前本人身体状况（选项值）
     */
    @Column(name = "current_health_value")
    private Integer currentHealthValue;

    /**
     * 被传染风险（选项值）
     */
    @Column(name = "current_contagion_risk_value")
    private Integer currentContagionRiskValue;

    /**
     * 当前体温（摄氏度）
     */
    @Column(name = "current_temperature")
    private Float currentTemperature;

    @Column(name = "psy_status")
    private Integer psyStatus;

    @Column(name = "psy_demand")
    private Integer psyDemand;

    @Column(name = "psy_knowledge")
    private Integer psyKnowledge;

    @Column(name = "return_company_date")
    private String returnCompanyDate;

    @Column(name = "plan_company_date")
    private String planCompanyDate;

    @Column(name = "template_code")
    private String templateCode;

    /**
     * 其它信息
     */
    private String remarks;

    private Date time;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取微信小程序用户id
     *
     * @return wxuid - 微信小程序用户id
     */
    public Integer getWxuid() {
        return wxuid;
    }

    /**
     * 设置微信小程序用户id
     *
     * @param wxuid 微信小程序用户id
     */
    public void setWxuid(Integer wxuid) {
        this.wxuid = wxuid;
    }

    /**
     * 获取机构id
     *
     * @return org_id - 机构id
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置机构id
     *
     * @param orgId 机构id
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取机构名称
     *
     * @return org_name - 机构名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置机构名称
     *
     * @param orgName 机构名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取用户标识码
     *
     * @return userID - 用户标识码
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户标识码
     *
     * @param userid 用户标识码
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取	是否返校（选项值）
     *
     * @return is_return_school - 	是否返校（选项值）
     */
    public Integer getIsReturnSchool() {
        return isReturnSchool;
    }

    /**
     * 设置	是否返校（选项值）
     *
     * @param isReturnSchool 	是否返校（选项值）
     */
    public void setIsReturnSchool(Integer isReturnSchool) {
        this.isReturnSchool = isReturnSchool;
    }

    /**
     * 获取所在宿舍号
     *
     * @return return_dorm_num - 所在宿舍号
     */
    public String getReturnDormNum() {
        return returnDormNum;
    }

    /**
     * 设置所在宿舍号
     *
     * @param returnDormNum 所在宿舍号
     */
    public void setReturnDormNum(String returnDormNum) {
        this.returnDormNum = returnDormNum;
    }

    /**
     * 获取返校时间（Unix时间戳-UTC时间）
     *
     * @return return_time - 返校时间（Unix时间戳-UTC时间）
     */
    public Date getReturnTime() {
        return returnTime;
    }

    /**
     * 设置返校时间（Unix时间戳-UTC时间）
     *
     * @param returnTime 返校时间（Unix时间戳-UTC时间）
     */
    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * 获取从哪里返回学校（行政区划字典值）
     *
     * @return return_district_value - 从哪里返回学校（行政区划字典值）
     */
    public Integer getReturnDistrictValue() {
        return returnDistrictValue;
    }

    /**
     * 设置从哪里返回学校（行政区划字典值）
     *
     * @param returnDistrictValue 从哪里返回学校（行政区划字典值）
     */
    public void setReturnDistrictValue(Integer returnDistrictValue) {
        this.returnDistrictValue = returnDistrictValue;
    }

    /**
     * 获取从哪里返回学校（从上级到下级按逗号分隔的字典值）
     *
     * @return return_district_path - 从哪里返回学校（从上级到下级按逗号分隔的字典值）
     */
    public String getReturnDistrictPath() {
        return returnDistrictPath;
    }

    /**
     * 设置从哪里返回学校（从上级到下级按逗号分隔的字典值）
     *
     * @param returnDistrictPath 从哪里返回学校（从上级到下级按逗号分隔的字典值）
     */
    public void setReturnDistrictPath(String returnDistrictPath) {
        this.returnDistrictPath = returnDistrictPath;
    }

    /**
     * 获取返校过程的交通信息
     *
     * @return return_traffic_info - 返校过程的交通信息
     */
    public String getReturnTrafficInfo() {
        return returnTrafficInfo;
    }

    /**
     * 设置返校过程的交通信息
     *
     * @param returnTrafficInfo 返校过程的交通信息
     */
    public void setReturnTrafficInfo(String returnTrafficInfo) {
        this.returnTrafficInfo = returnTrafficInfo;
    }

    /**
     * 获取目前所在地
     *
     * @return current_district_value - 目前所在地
     */
    public Integer getCurrentDistrictValue() {
        return currentDistrictValue;
    }

    /**
     * 设置目前所在地
     *
     * @param currentDistrictValue 目前所在地
     */
    public void setCurrentDistrictValue(Integer currentDistrictValue) {
        this.currentDistrictValue = currentDistrictValue;
    }

    /**
     * 获取目前所在地（从上级到下级按逗号分隔的字典值）
     *
     * @return current_district_path - 目前所在地（从上级到下级按逗号分隔的字典值）
     */
    public String getCurrentDistrictPath() {
        return currentDistrictPath;
    }

    /**
     * 设置目前所在地（从上级到下级按逗号分隔的字典值）
     *
     * @param currentDistrictPath 目前所在地（从上级到下级按逗号分隔的字典值）
     */
    public void setCurrentDistrictPath(String currentDistrictPath) {
        this.currentDistrictPath = currentDistrictPath;
    }

    /**
     * 获取目前本人身体状况（选项值）
     *
     * @return current_health_value - 目前本人身体状况（选项值）
     */
    public Integer getCurrentHealthValue() {
        return currentHealthValue;
    }

    /**
     * 设置目前本人身体状况（选项值）
     *
     * @param currentHealthValue 目前本人身体状况（选项值）
     */
    public void setCurrentHealthValue(Integer currentHealthValue) {
        this.currentHealthValue = currentHealthValue;
    }

    /**
     * 获取被传染风险（选项值）
     *
     * @return current_contagion_risk_value - 被传染风险（选项值）
     */
    public Integer getCurrentContagionRiskValue() {
        return currentContagionRiskValue;
    }

    /**
     * 设置被传染风险（选项值）
     *
     * @param currentContagionRiskValue 被传染风险（选项值）
     */
    public void setCurrentContagionRiskValue(Integer currentContagionRiskValue) {
        this.currentContagionRiskValue = currentContagionRiskValue;
    }

    /**
     * 获取当前体温（摄氏度）
     *
     * @return current_temperature - 当前体温（摄氏度）
     */
    public Float getCurrentTemperature() {
        return currentTemperature;
    }

    /**
     * 设置当前体温（摄氏度）
     *
     * @param currentTemperature 当前体温（摄氏度）
     */
    public void setCurrentTemperature(Float currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    /**
     * @return psy_status
     */
    public Integer getPsyStatus() {
        return psyStatus;
    }

    /**
     * @param psyStatus
     */
    public void setPsyStatus(Integer psyStatus) {
        this.psyStatus = psyStatus;
    }

    /**
     * @return psy_demand
     */
    public Integer getPsyDemand() {
        return psyDemand;
    }

    /**
     * @param psyDemand
     */
    public void setPsyDemand(Integer psyDemand) {
        this.psyDemand = psyDemand;
    }

    /**
     * @return psy_knowledge
     */
    public Integer getPsyKnowledge() {
        return psyKnowledge;
    }

    /**
     * @param psyKnowledge
     */
    public void setPsyKnowledge(Integer psyKnowledge) {
        this.psyKnowledge = psyKnowledge;
    }

    /**
     * @return return_company_date
     */
    public String getReturnCompanyDate() {
        return returnCompanyDate;
    }

    /**
     * @param returnCompanyDate
     */
    public void setReturnCompanyDate(String returnCompanyDate) {
        this.returnCompanyDate = returnCompanyDate;
    }

    /**
     * @return plan_company_date
     */
    public String getPlanCompanyDate() {
        return planCompanyDate;
    }

    /**
     * @param planCompanyDate
     */
    public void setPlanCompanyDate(String planCompanyDate) {
        this.planCompanyDate = planCompanyDate;
    }

    /**
     * @return template_code
     */
    public String getTemplateCode() {
        return templateCode;
    }

    /**
     * @param templateCode
     */
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    /**
     * 获取其它信息
     *
     * @return remarks - 其它信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置其它信息
     *
     * @param remarks 其它信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
    }
}