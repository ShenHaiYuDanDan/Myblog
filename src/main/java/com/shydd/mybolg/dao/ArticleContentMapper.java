package com.shydd.mybolg.dao;

import com.shydd.mybolg.entity.ArticleContent;
import com.shydd.mybolg.entity.ArticleContentExample;
import java.util.List;

public interface ArticleContentMapper {
    int insert(ArticleContent record);

    int insertSelective(ArticleContent record);

    List<ArticleContent> selectByExampleWithBLOBs(ArticleContentExample example);

    List<ArticleContent> selectByExample(ArticleContentExample example);
}