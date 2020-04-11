package com.sfc.es.service.impl;

import com.github.pagehelper.PageHelper;
import com.sfc.common.core.util.UserContextHolder;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.dao.MessageMapper;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.MessageParam;
import com.sfc.es.entity.param.MessageSearchParam;
import com.sfc.es.entity.po.Message;
import com.sfc.es.service.MessageService;
import com.sfc.es.util.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Service
@Slf4j
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageMapper messageMapper;

	@Override
	public PageInfo<Message> findPageInfo(MessageSearchParam param, Page page) {
		Message message = BeanUtil.copyObject(param, Message.class);
		message.setStatus(1);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<>(messageMapper.findPageInfo(message));
	}

	@Override
	public List<Message> findAll() {
		List<Message> list = messageMapper.findPageInfo(new Message());
		return list;
	}

	@Override
	public List<Message> find(MessageSearchParam param) {
		Message message = BeanUtil.copyObject(param, Message.class);
		List<Message> list = messageMapper.findPageInfo(message);
		return list;
	}

	@Override
	public Message findById(Integer id) {
		return messageMapper.findById(id);
	}

	@Override
	public Message insert(MessageParam param){
		Message message = BeanUtil.copyObject(param, Message.class);
		message.setCreateBy(UserContextHolder.getInstance().getUserId());
		message.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = messageMapper.insert(message);
        if(count == 0){
            return null;
        }
        return message;
	}

    @Override
	public Message update(MessageParam param) {
		Message message = BeanUtil.copyObject(param, Message.class);
		message.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = messageMapper.update(message);
		if(count == 0){
            return null;
        }
        return message;
	}

    @Override
    public int deleteById(Integer id) {
    	Message message=new Message();
		message.setId(id);
		message.setUpdateBy(UserContextHolder.getInstance().getUserId());
    	return messageMapper.delete(message);
    }

	@Transactional
	@Override
	public void deleteBatch(Integer[] ids) {
		for (Integer id : ids) {
			deleteById(id);
		}
	}

}
