package miniprogram.server.service;

import miniprogram.server.beans.ComDistrictLevel;
import miniprogram.server.mapper.ComDistrictLevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ComDistrictLevelService {
    @Autowired
    ComDistrictLevelMapper comDistrictLevelMapper;

    public List<ComDistrictLevel> selectAll() {
        return comDistrictLevelMapper.selectAll();
    }
}
