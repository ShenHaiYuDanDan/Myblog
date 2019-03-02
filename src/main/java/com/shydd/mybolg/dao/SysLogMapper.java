package com.shydd.mybolg.dao;

import com.shydd.mybolg.entity.SysLog;
import com.shydd.mybolg.entity.SysLogExample;
import java.util.List;

public interface SysLogMapper {
    int insert(SysLog record);

    int insertSelective(SysLog record);

    List<SysLog> selectByExample(SysLogExample example);
}