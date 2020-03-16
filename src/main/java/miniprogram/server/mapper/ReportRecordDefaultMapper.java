package miniprogram.server.mapper;

import miniprogram.server.beans.ReportRecordDefault;
import miniprogram.server.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface ReportRecordDefaultMapper extends MyMapper<ReportRecordDefault> {
    ReportRecordDefault selectLastByName(@Param("name") String name);
}