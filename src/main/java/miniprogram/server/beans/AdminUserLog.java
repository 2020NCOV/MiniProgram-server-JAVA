package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "admin_user_log")
public class AdminUserLog {
    @Id
    private Integer id;

    /**
     * user表ID
     */
    private Integer uid;

    private String name;

    /**
     * 操作类别
     */
    @Column(name = "ope_type")
    private Integer opeType;

    /**
     * URL
     */
    private String path;

    /**
     * 操作内容
     */
    private String content;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 浏览器数据
     */
    private String agent;

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
     * 获取user表ID
     *
     * @return uid - user表ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置user表ID
     *
     * @param uid user表ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
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
     * 获取操作类别
     *
     * @return ope_type - 操作类别
     */
    public Integer getOpeType() {
        return opeType;
    }

    /**
     * 设置操作类别
     *
     * @param opeType 操作类别
     */
    public void setOpeType(Integer opeType) {
        this.opeType = opeType;
    }

    /**
     * 获取URL
     *
     * @return path - URL
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置URL
     *
     * @param path URL
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取操作内容
     *
     * @return content - 操作内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置操作内容
     *
     * @param content 操作内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取IP地址
     *
     * @return ip - IP地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置IP地址
     *
     * @param ip IP地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取浏览器数据
     *
     * @return agent - 浏览器数据
     */
    public String getAgent() {
        return agent;
    }

    /**
     * 设置浏览器数据
     *
     * @param agent 浏览器数据
     */
    public void setAgent(String agent) {
        this.agent = agent;
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