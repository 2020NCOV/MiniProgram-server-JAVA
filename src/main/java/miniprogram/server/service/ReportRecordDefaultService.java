package miniprogram.server.service;

import miniprogram.server.beans.ReportRecordDefault;
import miniprogram.server.mapper.ReportRecordDefaultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReportRecordDefaultService {

    @Autowired
    ReportRecordDefaultMapper reportRecordDefaultMapper;

    public void insert(ReportRecordDefault reportRecordDefault) {
        reportRecordDefaultMapper.insert(reportRecordDefault);
    }

    public ReportRecordDefault selectLastByName(String name) {
        return reportRecordDefaultMapper.selectLastByName(name);
    }

}
