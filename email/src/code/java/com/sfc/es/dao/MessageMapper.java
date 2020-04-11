package com.sfc.es.dao;

import com.sfc.es.entity.po.Message;
import java.util.List;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface MessageMapper {
    List<Message> findPageInfo(Message message);
    Message findById(Integer id);
    int insert(Message message);
    int insertBatch(List<Message> list);
    int update(Message message);
    int delete(Message message);
}