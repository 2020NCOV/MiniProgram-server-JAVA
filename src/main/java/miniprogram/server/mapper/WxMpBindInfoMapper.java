package miniprogram.server.mapper;

import miniprogram.server.beans.Organization;
import miniprogram.server.beans.WxMpBindInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

@Mapper
public interface WxMpBindInfoMapper{

    Organization selectByOrgId(@Param("wxUid") Integer wxUid);

    WxMpBindInfo selectByOrgIdAndUid(@Param("wxUid") Integer wxUid, @Param("orgId") String orgId);

    WxMpBindInfo isBindByParam(@Param("wxUid") Integer wxUid, @Param("orgId") String orgId, @Param("userId") String userId);

    void updateStatus(@Param("wxUid") Integer wxUid);

    WxMpBindInfo select(@RequestBody WxMpBindInfo wxMpBindInfo);

}