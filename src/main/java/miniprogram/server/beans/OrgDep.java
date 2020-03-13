package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "org_dep")
public class OrgDep {
    @Id
    private Integer id;

    @Column(name = "org_id")
    private Integer orgId;

    @Column(name = "dep_name")
    private String depName;

    private Integer level;

    @Column(name = "is_del")
    private Integer isDel;

    private Integer status;

    private String remark;

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
     * @return org_id
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * @return dep_name
     */
    public String getDepName() {
        return depName;
    }

    /**
     * @param depName
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
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