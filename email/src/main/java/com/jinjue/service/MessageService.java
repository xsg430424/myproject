package com.sfc.es.service;

import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.MessageParam;
import com.sfc.es.entity.param.MessageSearchParam;
import com.sfc.es.entity.po.Message;
import com.sfc.es.utils.PageInfo;

import java.util.List;

/**
 * @Des:
 * @Date: 2019/07/07
 * @Author: Gavin Shaw
 */
public interface MessageService {
    PageInfo<Message> findPageInfo(MessageSearchParam param, Page page);
    List<Message> findAll();
    List<Message> find(MessageSearchParam param);
    Message findById(Integer id);
    int insert(MessageParam param);
    int update(MessageParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}
