package com.shydd.mybolg.dao;

import com.shydd.mybolg.entity.ArticleMessage;
import com.shydd.mybolg.entity.ArticleMessageExample;
import java.util.List;

public interface ArticleMessageMapper {
    int insert(ArticleMessage record);

    int insertSelective(ArticleMessage record);

    List<ArticleMessage> selectByExample(ArticleMessageExample example);
}