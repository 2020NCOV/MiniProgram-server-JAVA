package miniprogram.server.utils;

public class JSONRes {

    private Integer errcode;
    private String token;
    private Integer uid;

    public JSONRes(Integer errcode, String token, Integer uid) {
        this.errcode = errcode;
        this.token = token;
        this.uid = uid;
    }

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "JSONopenid{" +
                "errcode=" + errcode +
                ", token='" + token + '\'' +
                ", uid=" + uid +
                '}';
    }
}
