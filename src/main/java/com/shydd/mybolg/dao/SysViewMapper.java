package com.shydd.mybolg.dao;

import com.shydd.mybolg.entity.SysView;
import com.shydd.mybolg.entity.SysViewExample;
import java.util.List;

public interface SysViewMapper {
    int insert(SysView record);

    int insertSelective(SysView record);

    List<SysView> selectByExample(SysViewExample example);
}