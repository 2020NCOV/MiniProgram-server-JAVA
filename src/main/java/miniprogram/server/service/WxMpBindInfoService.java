package miniprogram.server.service;


import miniprogram.server.beans.Organization;
import miniprogram.server.beans.WxMpBindInfo;
import miniprogram.server.mapper.WxMpBindInfoMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WxMpBindInfoService {

    @Autowired
    WxMpBindInfoMapper wxMpBindInfoMapper;

    public Organization selectByUserId(Integer wxUid){
        return wxMpBindInfoMapper.selectByUserId(wxUid);
    }

    public WxMpBindInfo selectByOrgIdAndUid(Integer wxUid, String orgId){
        return wxMpBindInfoMapper.selectByOrgIdAndUid(wxUid, orgId);
    }

    public WxMpBindInfo isBindByParam(Integer wxUid, String orgId, String userId){
        return wxMpBindInfoMapper.isBindByParam(wxUid, orgId, userId);
    }

    public WxMpBindInfo mySelect(WxMpBindInfo wxMpBindInfo){
        return wxMpBindInfoMapper.mySelect(wxMpBindInfo);
    }

    public void updateStatus(Integer wxUid){
        wxMpBindInfoMapper.updateStatus(wxUid);
    }

    public void insert(WxMpBindInfo wxMpBindInfo) {
        wxMpBindInfoMapper.insert(wxMpBindInfo);
    }

    public void update(WxMpBindInfo wxMpBindInfo) {
        wxMpBindInfoMapper.insert(wxMpBindInfo);
    }
}
