package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "org_whitelist")
public class OrgWhitelist {
    @Id
    private Integer id;

    /**
     * 机构id
     */
    @Column(name = "org_id")
    private Integer orgId;

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
     * 性别
     */
    private String gender;

    /**
     * 一级子部门id
     */
    @Column(name = "sub1_department_id")
    private Integer sub1DepartmentId;

    /**
     * 二级子部门
     */
    @Column(name = "sub2_department_id")
    private Integer sub2DepartmentId;

    /**
     * 类型1（学生类型）
     */
    private String tag1;

    private String tag2;

    private String tag3;

    private String tag4;

    /**
     * 添加时间
     */
    @Column(name = "add_datetime")
    private Date addDatetime;

    /**
     * 最后更新时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 添加备注
     */
    @Column(name = "add_remark")
    private String addRemark;

    /**
     * 用户录入数据，为了便于核对
     */
    @Column(name = "dep_name")
    private String depName;

    /**
     * 报告编号
     */
    @Column(name = "report_id")
    private Integer reportId;

    /**
     * 最后报告时间
     */
    @Column(name = "report_date")
    private Date reportDate;

    /**
     * 状态
     */
    private Integer status;

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
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取一级子部门id
     *
     * @return sub1_department_id - 一级子部门id
     */
    public Integer getSub1DepartmentId() {
        return sub1DepartmentId;
    }

    /**
     * 设置一级子部门id
     *
     * @param sub1DepartmentId 一级子部门id
     */
    public void setSub1DepartmentId(Integer sub1DepartmentId) {
        this.sub1DepartmentId = sub1DepartmentId;
    }

    /**
     * 获取二级子部门
     *
     * @return sub2_department_id - 二级子部门
     */
    public Integer getSub2DepartmentId() {
        return sub2DepartmentId;
    }

    /**
     * 设置二级子部门
     *
     * @param sub2DepartmentId 二级子部门
     */
    public void setSub2DepartmentId(Integer sub2DepartmentId) {
        this.sub2DepartmentId = sub2DepartmentId;
    }

    /**
     * 获取类型1（学生类型）
     *
     * @return tag1 - 类型1（学生类型）
     */
    public String getTag1() {
        return tag1;
    }

    /**
     * 设置类型1（学生类型）
     *
     * @param tag1 类型1（学生类型）
     */
    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    /**
     * @return tag2
     */
    public String getTag2() {
        return tag2;
    }

    /**
     * @param tag2
     */
    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    /**
     * @return tag3
     */
    public String getTag3() {
        return tag3;
    }

    /**
     * @param tag3
     */
    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    /**
     * @return tag4
     */
    public String getTag4() {
        return tag4;
    }

    /**
     * @param tag4
     */
    public void setTag4(String tag4) {
        this.tag4 = tag4;
    }

    /**
     * 获取添加时间
     *
     * @return add_datetime - 添加时间
     */
    public Date getAddDatetime() {
        return addDatetime;
    }

    /**
     * 设置添加时间
     *
     * @param addDatetime 添加时间
     */
    public void setAddDatetime(Date addDatetime) {
        this.addDatetime = addDatetime;
    }

    /**
     * 获取最后更新时间
     *
     * @return last_update_time - 最后更新时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastUpdateTime 最后更新时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 获取添加备注
     *
     * @return add_remark - 添加备注
     */
    public String getAddRemark() {
        return addRemark;
    }

    /**
     * 设置添加备注
     *
     * @param addRemark 添加备注
     */
    public void setAddRemark(String addRemark) {
        this.addRemark = addRemark;
    }

    /**
     * 获取用户录入数据，为了便于核对
     *
     * @return dep_name - 用户录入数据，为了便于核对
     */
    public String getDepName() {
        return depName;
    }

    /**
     * 设置用户录入数据，为了便于核对
     *
     * @param depName 用户录入数据，为了便于核对
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * 获取报告编号
     *
     * @return report_id - 报告编号
     */
    public Integer getReportId() {
        return reportId;
    }

    /**
     * 设置报告编号
     *
     * @param reportId 报告编号
     */
    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    /**
     * 获取最后报告时间
     *
     * @return report_date - 最后报告时间
     */
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * 设置最后报告时间
     *
     * @param reportDate 最后报告时间
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}