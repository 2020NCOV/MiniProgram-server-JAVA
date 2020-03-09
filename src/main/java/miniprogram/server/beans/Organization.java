package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Organization {
    @Id
    private Integer id;

    /**
     * 单位名称
     */
    private String corpname;

    @Column(name = "corpname_full")
    private String corpnameFull;

    /**
     * mp 小程序   qw 企业微信
     */
    @Column(name = "access_type")
    private String accessType;

    /**
     * 单位模板
     */
    @Column(name = "template_code")
    private String templateCode;

    /**
     * 单位编号
     */
    @Column(name = "corp_code")
    private String corpCode;

    /**
     * 公司名称/学校名称
     */
    @Column(name = "type_corpname")
    private String typeCorpname;

    /**
     * 学号/职工号等内容提示语
     */
    @Column(name = "type_username")
    private String typeUsername;

    @Column(name = "admin_name")
    private String adminName;

    private String tel;

    @Column(name = "is_del")
    private Integer isDel;

    private Integer status;

    private String remark;

    @Column(name = "add_date")
    private Date addDate;

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
     * 获取单位名称
     *
     * @return corpname - 单位名称
     */
    public String getCorpname() {
        return corpname;
    }

    /**
     * 设置单位名称
     *
     * @param corpname 单位名称
     */
    public void setCorpname(String corpname) {
        this.corpname = corpname;
    }

    /**
     * @return corpname_full
     */
    public String getCorpnameFull() {
        return corpnameFull;
    }

    /**
     * @param corpnameFull
     */
    public void setCorpnameFull(String corpnameFull) {
        this.corpnameFull = corpnameFull;
    }

    /**
     * 获取mp 小程序   qw 企业微信
     *
     * @return access_type - mp 小程序   qw 企业微信
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * 设置mp 小程序   qw 企业微信
     *
     * @param accessType mp 小程序   qw 企业微信
     */
    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    /**
     * 获取单位模板
     *
     * @return template_code - 单位模板
     */
    public String getTemplateCode() {
        return templateCode;
    }

    /**
     * 设置单位模板
     *
     * @param templateCode 单位模板
     */
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    /**
     * 获取单位编号
     *
     * @return corp_code - 单位编号
     */
    public String getCorpCode() {
        return corpCode;
    }

    /**
     * 设置单位编号
     *
     * @param corpCode 单位编号
     */
    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }

    /**
     * 获取公司名称/学校名称
     *
     * @return type_corpname - 公司名称/学校名称
     */
    public String getTypeCorpname() {
        return typeCorpname;
    }

    /**
     * 设置公司名称/学校名称
     *
     * @param typeCorpname 公司名称/学校名称
     */
    public void setTypeCorpname(String typeCorpname) {
        this.typeCorpname = typeCorpname;
    }

    /**
     * 获取学号/职工号等内容提示语
     *
     * @return type_username - 学号/职工号等内容提示语
     */
    public String getTypeUsername() {
        return typeUsername;
    }

    /**
     * 设置学号/职工号等内容提示语
     *
     * @param typeUsername 学号/职工号等内容提示语
     */
    public void setTypeUsername(String typeUsername) {
        this.typeUsername = typeUsername;
    }

    /**
     * @return admin_name
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * @param adminName
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return is_del
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return add_date
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * @param addDate
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
}