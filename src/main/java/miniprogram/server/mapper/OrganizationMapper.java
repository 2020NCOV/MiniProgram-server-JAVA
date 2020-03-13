package miniprogram.server.mapper;

import miniprogram.server.beans.Organization;
import miniprogram.server.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrganizationMapper{

    Organization selectByCorpCode(@Param("corpCode") Integer corpCode);

}