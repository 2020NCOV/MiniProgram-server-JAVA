package miniprogram.server.service;

import miniprogram.server.beans.Organization;
import miniprogram.server.mapper.OrganizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrganizationService {

    @Autowired
    OrganizationMapper organizationMapper;

    public Organization selectByCorpCode(Integer corpCode){
        return organizationMapper.selectByCorpCode(corpCode);
    }

}
