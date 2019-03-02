package com.shydd.mybolg.dao;

import com.shydd.mybolg.entity.ArticleInfo;
import com.shydd.mybolg.entity.ArticleInfoExample;
import java.util.List;

public interface ArticleInfoMapper {
    int insert(ArticleInfo record);

    int insertSelective(ArticleInfo record);

    List<ArticleInfo> selectByExample(ArticleInfoExample example);
}