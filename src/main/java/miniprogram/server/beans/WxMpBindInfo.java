package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "wx_mp_bind_info")
public class WxMpBindInfo {
    @Id
    private Integer id;

    /**
     * department_id
     */
    @Column(name = "org_id")
    private Integer orgId;

    /**
     * weixin_id
     */
    @Column(name = "wx_uid")
    private Integer wxUid;

    /**
     * 用户唯一表示
     */
    private String username;

    /**
     * 是否绑定
     */
    private Integer isbind;

    @Column(name = "bind_date")
    private Date bindDate;

    @Column(name = "unbind_date")
    private Date unbindDate;

    private String remark;

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
     * 获取department_id
     *
     * @return org_id - department_id
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置department_id
     *
     * @param orgId department_id
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取weixin_id
     *
     * @return wx_uid - weixin_id
     */
    public Integer getWxUid() {
        return wxUid;
    }

    /**
     * 设置weixin_id
     *
     * @param wxUid weixin_id
     */
    public void setWxUid(Integer wxUid) {
        this.wxUid = wxUid;
    }

    /**
     * 获取用户唯一表示
     *
     * @return username - 用户唯一表示
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户唯一表示
     *
     * @param username 用户唯一表示
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取是否绑定
     *
     * @return isbind - 是否绑定
     */
    public Integer getIsbind() {
        return isbind;
    }

    /**
     * 设置是否绑定
     *
     * @param isbind 是否绑定
     */
    public void setIsbind(Integer isbind) {
        this.isbind = isbind;
    }

    /**
     * @return bind_date
     */
    public Date getBindDate() {
        return bindDate;
    }

    /**
     * @param bindDate
     */
    public void setBindDate(Date bindDate) {
        this.bindDate = bindDate;
    }

    /**
     * @return unbind_date
     */
    public Date getUnbindDate() {
        return unbindDate;
    }

    /**
     * @param unbindDate
     */
    public void setUnbindDate(Date unbindDate) {
        this.unbindDate = unbindDate;
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
}