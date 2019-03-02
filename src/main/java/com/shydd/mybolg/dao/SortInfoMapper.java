package com.shydd.mybolg.dao;

import com.shydd.mybolg.entity.SortInfo;
import com.shydd.mybolg.entity.SortInfoExample;
import java.util.List;

public interface SortInfoMapper {
    int insert(SortInfo record);

    int insertSelective(SortInfo record);

    List<SortInfo> selectByExample(SortInfoExample example);
}