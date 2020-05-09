package com.jinjue.demo.service;

import com.jinjue.demo.common.entity.Page;
import com.jinjue.demo.common.utils.PageInfo;
import com.jinjue.demo.po.Message;
import com.jinjue.demo.vo.request.MessageParam;
import com.jinjue.demo.vo.request.MessageSearchParam;

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
