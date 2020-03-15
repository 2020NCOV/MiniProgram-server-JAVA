package miniprogram.server.mapper;

import miniprogram.server.beans.WxMpUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WxMpUserMapper{

    WxMpUser selectByOpenId(@Param("openid") String openid);

    WxMpUser selectByWid(@Param("wid") Integer wid);

    void insert(WxMpUser wxMpUser);

    void update(WxMpUser wxMpUser);

    WxMpUser selectByUserid(@Param("userid") String userid);
}