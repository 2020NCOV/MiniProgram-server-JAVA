package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "wx_qy_access_token")
public class WxQyAccessToken {
    @Id
    private Integer id;

    @Column(name = "agent_id")
    private String agentId;

    @Column(name = "access_token")
    private String accessToken;

    @Column(name = "expires_in")
    private Integer expiresIn;

    private Date time;

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
     * @return agent_id
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * @return access_token
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * @param accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * @return expires_in
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * @param expiresIn
     */
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
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