package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "com_provincial")
public class ComProvincial {
    @Id
    private Integer pid;

    @Column(name = "Provincial")
    private String provincial;

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return Provincial
     */
    public String getProvincial() {
        return provincial;
    }

    /**
     * @param provincial
     */
    public void setProvincial(String provincial) {
        this.provincial = provincial;
    }
}