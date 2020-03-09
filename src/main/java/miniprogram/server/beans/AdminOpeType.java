package miniprogram.server.beans;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "admin_ope_type")
public class AdminOpeType {
    @Id
    private Integer id;

    /**
     * 操作名
     */
    private String name;

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
     * 获取操作名
     *
     * @return name - 操作名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置操作名
     *
     * @param name 操作名
     */
    public void setName(String name) {
        this.name = name;
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
}