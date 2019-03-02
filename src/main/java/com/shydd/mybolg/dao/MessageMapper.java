package com.shydd.mybolg.dao;

import com.shydd.mybolg.entity.Message;
import com.shydd.mybolg.entity.MessageExample;
import java.util.List;

public interface MessageMapper {
    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);
}