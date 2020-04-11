package com.sfc.es.service;

import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.MessageParam;
import com.sfc.es.entity.param.MessageSearchParam;
import com.sfc.es.entity.po.Message;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface MessageService {
    PageInfo<Message> findPageInfo(MessageSearchParam param, Page page);
    List<Message> findAll();
    List<Message> find(MessageSearchParam param);
    Message findById(Integer id);
    Message insert(MessageParam param);
    Message update(MessageParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}