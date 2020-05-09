package com.jinjue.service;

import com.jinjue.common.entity.Page;
import com.jinjue.common.utils.PageInfo;
import com.jinjue.po.Message;
import com.jinjue.vo.request.MessageParam;
import com.jinjue.vo.request.MessageSearchParam;

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
