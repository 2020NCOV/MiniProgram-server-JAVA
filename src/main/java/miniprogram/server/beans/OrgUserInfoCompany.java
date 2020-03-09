package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "org_user_info_company")
public class OrgUserInfoCompany {
    @Id
    private Integer id;

    /**
     * 机构id
     */
    @Column(name = "cor_id")
    private Integer corId;

    /**
     * 机构名称
     */
    @Column(name = "cor_name")
    private String corName;

    /**
     * 用户标识
     */
    @Column(name = "userID")
    private String userid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 学院
     */
    private String school;

    /**
     * 年级
     */
    private String grade;

    /**
     * 生源地
     */
    @Column(name = "source_place")
    private String sourcePlace;

    /**
     * 手机号
     */
    private String telphone;

    /**
     * 是否离京
     */
    @Column(name = "is_left_bj")
    private String isLeftBj;

    /**
     * 离开日期
     */
    @Column(name = "left_date")
    private String leftDate;

    /**
     * 离开使用交通工具
     */
    @Column(name = "left_transport")
    private String leftTransport;

    /**
     * 具体交通信息
     */
    @Column(name = "left_transport_info")
    private String leftTransportInfo;

    /**
     * 去湖北情况
     */
    @Column(name = "goto_hubei")
    private String gotoHubei;

    /**
     * 湖北日期起
     */
    @Column(name = "goto_hubei_date1")
    private String gotoHubeiDate1;

    /**
     * 湖北日期止
     */
    @Column(name = "goto_hubei_date2")
    private String gotoHubeiDate2;

    /**
     * 去湖北详情
     */
    @Column(name = "goto_hubei_info")
    private String gotoHubeiInfo;

    /**
     * 是否接触过湖北地区活动的人员
     */
    @Column(name = "is_touch_hubei_person")
    private String isTouchHubeiPerson;

    /**
     * 接触时间1
     */
    @Column(name = "touch_hubei_date1")
    private String touchHubeiDate1;

    /**
     * 接触时间2
     */
    @Column(name = "touch_hubei_date2")
    private String touchHubeiDate2;

    /**
     * 是否返京
     */
    @Column(name = "is_return")
    private String isReturn;

    /**
     * 返京日期
     */
    @Column(name = "return_date")
    private String returnDate;

    /**
     * 交通工具
     */
    @Column(name = "return_transport")
    private String returnTransport;

    /**
     * 交通工具详细信息
     */
    @Column(name = "return_transport_info")
    private String returnTransportInfo;

    /**
     * 是否删除
     */
    @Column(name = "is_del")
    private Integer isDel;

    /**
     * IP
     */
    private String ip;

    private String agent;

    /**
     * 创建时间
     */
    private Date time;

    /**
     * 最后更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取机构id
     *
     * @return cor_id - 机构id
     */
    public Integer getCorId() {
        return corId;
    }

    /**
     * 设置机构id
     *
     * @param corId 机构id
     */
    public void setCorId(Integer corId) {
        this.corId = corId;
    }

    /**
     * 获取机构名称
     *
     * @return cor_name - 机构名称
     */
    public String getCorName() {
        return corName;
    }

    /**
     * 设置机构名称
     *
     * @param corName 机构名称
     */
    public void setCorName(String corName) {
        this.corName = corName;
    }

    /**
     * 获取用户标识
     *
     * @return userID - 用户标识
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户标识
     *
     * @param userid 用户标识
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
     * 获取学院
     *
     * @return school - 学院
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置学院
     *
     * @param school 学院
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取年级
     *
     * @return grade - 年级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置年级
     *
     * @param grade 年级
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取生源地
     *
     * @return source_place - 生源地
     */
    public String getSourcePlace() {
        return sourcePlace;
    }

    /**
     * 设置生源地
     *
     * @param sourcePlace 生源地
     */
    public void setSourcePlace(String sourcePlace) {
        this.sourcePlace = sourcePlace;
    }

    /**
     * 获取手机号
     *
     * @return telphone - 手机号
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 设置手机号
     *
     * @param telphone 手机号
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    /**
     * 获取是否离京
     *
     * @return is_left_bj - 是否离京
     */
    public String getIsLeftBj() {
        return isLeftBj;
    }

    /**
     * 设置是否离京
     *
     * @param isLeftBj 是否离京
     */
    public void setIsLeftBj(String isLeftBj) {
        this.isLeftBj = isLeftBj;
    }

    /**
     * 获取离开日期
     *
     * @return left_date - 离开日期
     */
    public String getLeftDate() {
        return leftDate;
    }

    /**
     * 设置离开日期
     *
     * @param leftDate 离开日期
     */
    public void setLeftDate(String leftDate) {
        this.leftDate = leftDate;
    }

    /**
     * 获取离开使用交通工具
     *
     * @return left_transport - 离开使用交通工具
     */
    public String getLeftTransport() {
        return leftTransport;
    }

    /**
     * 设置离开使用交通工具
     *
     * @param leftTransport 离开使用交通工具
     */
    public void setLeftTransport(String leftTransport) {
        this.leftTransport = leftTransport;
    }

    /**
     * 获取具体交通信息
     *
     * @return left_transport_info - 具体交通信息
     */
    public String getLeftTransportInfo() {
        return leftTransportInfo;
    }

    /**
     * 设置具体交通信息
     *
     * @param leftTransportInfo 具体交通信息
     */
    public void setLeftTransportInfo(String leftTransportInfo) {
        this.leftTransportInfo = leftTransportInfo;
    }

    /**
     * 获取去湖北情况
     *
     * @return goto_hubei - 去湖北情况
     */
    public String getGotoHubei() {
        return gotoHubei;
    }

    /**
     * 设置去湖北情况
     *
     * @param gotoHubei 去湖北情况
     */
    public void setGotoHubei(String gotoHubei) {
        this.gotoHubei = gotoHubei;
    }

    /**
     * 获取湖北日期起
     *
     * @return goto_hubei_date1 - 湖北日期起
     */
    public String getGotoHubeiDate1() {
        return gotoHubeiDate1;
    }

    /**
     * 设置湖北日期起
     *
     * @param gotoHubeiDate1 湖北日期起
     */
    public void setGotoHubeiDate1(String gotoHubeiDate1) {
        this.gotoHubeiDate1 = gotoHubeiDate1;
    }

    /**
     * 获取湖北日期止
     *
     * @return goto_hubei_date2 - 湖北日期止
     */
    public String getGotoHubeiDate2() {
        return gotoHubeiDate2;
    }

    /**
     * 设置湖北日期止
     *
     * @param gotoHubeiDate2 湖北日期止
     */
    public void setGotoHubeiDate2(String gotoHubeiDate2) {
        this.gotoHubeiDate2 = gotoHubeiDate2;
    }

    /**
     * 获取去湖北详情
     *
     * @return goto_hubei_info - 去湖北详情
     */
    public String getGotoHubeiInfo() {
        return gotoHubeiInfo;
    }

    /**
     * 设置去湖北详情
     *
     * @param gotoHubeiInfo 去湖北详情
     */
    public void setGotoHubeiInfo(String gotoHubeiInfo) {
        this.gotoHubeiInfo = gotoHubeiInfo;
    }

    /**
     * 获取是否接触过湖北地区活动的人员
     *
     * @return is_touch_hubei_person - 是否接触过湖北地区活动的人员
     */
    public String getIsTouchHubeiPerson() {
        return isTouchHubeiPerson;
    }

    /**
     * 设置是否接触过湖北地区活动的人员
     *
     * @param isTouchHubeiPerson 是否接触过湖北地区活动的人员
     */
    public void setIsTouchHubeiPerson(String isTouchHubeiPerson) {
        this.isTouchHubeiPerson = isTouchHubeiPerson;
    }

    /**
     * 获取接触时间1
     *
     * @return touch_hubei_date1 - 接触时间1
     */
    public String getTouchHubeiDate1() {
        return touchHubeiDate1;
    }

    /**
     * 设置接触时间1
     *
     * @param touchHubeiDate1 接触时间1
     */
    public void setTouchHubeiDate1(String touchHubeiDate1) {
        this.touchHubeiDate1 = touchHubeiDate1;
    }

    /**
     * 获取接触时间2
     *
     * @return touch_hubei_date2 - 接触时间2
     */
    public String getTouchHubeiDate2() {
        return touchHubeiDate2;
    }

    /**
     * 设置接触时间2
     *
     * @param touchHubeiDate2 接触时间2
     */
    public void setTouchHubeiDate2(String touchHubeiDate2) {
        this.touchHubeiDate2 = touchHubeiDate2;
    }

    /**
     * 获取是否返京
     *
     * @return is_return - 是否返京
     */
    public String getIsReturn() {
        return isReturn;
    }

    /**
     * 设置是否返京
     *
     * @param isReturn 是否返京
     */
    public void setIsReturn(String isReturn) {
        this.isReturn = isReturn;
    }

    /**
     * 获取返京日期
     *
     * @return return_date - 返京日期
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * 设置返京日期
     *
     * @param returnDate 返京日期
     */
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * 获取交通工具
     *
     * @return return_transport - 交通工具
     */
    public String getReturnTransport() {
        return returnTransport;
    }

    /**
     * 设置交通工具
     *
     * @param returnTransport 交通工具
     */
    public void setReturnTransport(String returnTransport) {
        this.returnTransport = returnTransport;
    }

    /**
     * 获取交通工具详细信息
     *
     * @return return_transport_info - 交通工具详细信息
     */
    public String getReturnTransportInfo() {
        return returnTransportInfo;
    }

    /**
     * 设置交通工具详细信息
     *
     * @param returnTransportInfo 交通工具详细信息
     */
    public void setReturnTransportInfo(String returnTransportInfo) {
        this.returnTransportInfo = returnTransportInfo;
    }

    /**
     * 获取是否删除
     *
     * @return is_del - 是否删除
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除
     *
     * @param isDel 是否删除
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取IP
     *
     * @return ip - IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置IP
     *
     * @param ip IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return agent
     */
    public String getAgent() {
        return agent;
    }

    /**
     * @param agent
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }

    /**
     * 获取创建时间
     *
     * @return time - 创建时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置创建时间
     *
     * @param time 创建时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取最后更新时间
     *
     * @return update_time - 最后更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后更新时间
     *
     * @param updateTime 最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}