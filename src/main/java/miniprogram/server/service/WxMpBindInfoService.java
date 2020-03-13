package miniprogram.server.service;


import miniprogram.server.beans.Organization;
import miniprogram.server.beans.WxMpBindInfo;
import miniprogram.server.mapper.WxMpBindInfoMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WxMpBindInfoService {

    @Autowired
    WxMpBindInfoMapper wxMpBindInfoMapper;

    public Organization selectByOrgId(Integer wxUid){
        return wxMpBindInfoMapper.selectByOrgId(wxUid);
    }

    public WxMpBindInfo selectByOrgIdAndUid(Integer wxUid, String orgId){
        return wxMpBindInfoMapper.selectByOrgIdAndUid(wxUid, orgId);
    }

    public WxMpBindInfo isBindByParam(Integer wxUid, String orgId, String userId){
        return wxMpBindInfoMapper.isBindByParam(wxUid, orgId, userId);
    }

    public WxMpBindInfo select(WxMpBindInfo wxMpBindInfo){
        return wxMpBindInfoMapper.select(wxMpBindInfo);
    }

    public void updateStatus(Integer wxUid){
        wxMpBindInfoMapper.updateStatus(wxUid);
    }

}
