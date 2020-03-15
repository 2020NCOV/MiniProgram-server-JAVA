package miniprogram.server.service;

import miniprogram.server.beans.WxMpUser;
import miniprogram.server.mapper.WxMpUserMapper;
import miniprogram.server.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class WxMpUserService {

    @Autowired
    WxMpUserMapper wxMpUserMapper;

    public void insert(WxMpUser wxMpUser){
        // 查询当前用户在数据库中是否存在
        WxMpUser result = wxMpUserMapper.selectByOpenId(wxMpUser.getOpenid());
        if(result != null){
            wxMpUser.setWid(result.getWid());
        }else{
            wxMpUser.setLoginTime(DateUtil.getDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
            wxMpUser.setTimeOut(DateUtil.getTime(new Date()));
            wxMpUser.setRegDate(new Date());
            wxMpUser.setStatus(0);
            wxMpUserMapper.insert(wxMpUser);
        }
    }

    public WxMpUser selectByWid(Integer wid){
        return wxMpUserMapper.selectByWid(wid);
    }

    public void update(WxMpUser wxMpUser){
        wxMpUserMapper.update(wxMpUser);
    }

    public WxMpUser selectByUserid(String userid){
        return wxMpUserMapper.selectByUserid(userid);
    }
}
