package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "wx_mp_user")
public class WxMpUser {
    @Id
    private Integer wid;

    private String openid;

    private String token;

    @Column(name = "time_out")
    private Integer timeOut;

    @Column(name = "session_key")
    private String sessionKey;

    private String nickname;

    private String gender;

    private String city;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "login_time")
    private String loginTime;

    private String userid;

    private String name;

    @Column(name = "phone_num")
    private String phoneNum;

    /**
     * 注册时间
     */
    @Column(name = "reg_date")
    private Date regDate;

    private Integer status;

    /**
     * @return wid
     */
    public Integer getWid() {
        return wid;
    }

    /**
     * @param wid
     */
    public void setWid(Integer wid) {
        this.wid = wid;
    }

    /**
     * @return openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return time_out
     */
    public Integer getTimeOut() {
        return timeOut;
    }

    /**
     * @param timeOut
     */
    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }

    /**
     * @return session_key
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**
     * @param sessionKey
     */
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return avatar_url
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * @return login_time
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime
     */
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
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
     * @return phone_num
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 获取注册时间
     *
     * @return reg_date - 注册时间
     */
    public Date getRegDate() {
        return regDate;
    }

    /**
     * 设置注册时间
     *
     * @param regDate 注册时间
     */
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
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