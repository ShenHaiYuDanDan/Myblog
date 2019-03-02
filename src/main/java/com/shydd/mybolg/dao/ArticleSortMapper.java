package com.shydd.mybolg.dao;

import com.shydd.mybolg.entity.ArticleSort;
import com.shydd.mybolg.entity.ArticleSortExample;
import java.util.List;

public interface ArticleSortMapper {
    int insert(ArticleSort record);

    int insertSelective(ArticleSort record);

    List<ArticleSort> selectByExample(ArticleSortExample example);
}