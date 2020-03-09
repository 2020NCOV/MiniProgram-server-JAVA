package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "admin_user")
public class AdminUser {
    @Id
    private Integer id;

    /**
     * 机构id
     */
    @Column(name = "org_id")
    private Integer orgId;

    /**
     * 所管理部门的id
     */
    @Column(name = "dep_id")
    private Integer depId;

    /**
     * 用户名
     */
    private String username;

    private String name;

    /**
     * 密码
     */
    private String password;

    private Integer role;

    /**
     * 内置机构管理员
     */
    @Column(name = "is_admin")
    private Integer isAdmin;

    @Column(name = "is_del")
    private Integer isDel;

    @Column(name = "need_m_pass")
    private Integer needMPass;

    private String remarks;

    private Date datetime;

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
     * 获取所管理部门的id
     *
     * @return dep_id - 所管理部门的id
     */
    public Integer getDepId() {
        return depId;
    }

    /**
     * 设置所管理部门的id
     *
     * @param depId 所管理部门的id
     */
    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * 获取内置机构管理员
     *
     * @return is_admin - 内置机构管理员
     */
    public Integer getIsAdmin() {
        return isAdmin;
    }

    /**
     * 设置内置机构管理员
     *
     * @param isAdmin 内置机构管理员
     */
    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
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
     * @return need_m_pass
     */
    public Integer getNeedMPass() {
        return needMPass;
    }

    /**
     * @param needMPass
     */
    public void setNeedMPass(Integer needMPass) {
        this.needMPass = needMPass;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return datetime
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * @param datetime
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}