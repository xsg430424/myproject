package com.sfc.es.service.impl;

import com.github.pagehelper.PageHelper;
import com.sfc.common.core.util.UserContextHolder;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.dao.ContactMapper;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.ContactParam;
import com.sfc.es.entity.param.ContactSearchParam;
import com.sfc.es.entity.po.Contact;
import com.sfc.es.service.ContactService;
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
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactMapper contactMapper;

	@Override
	public PageInfo<Contact> findPageInfo(ContactSearchParam param, Page page) {
		Contact contact = BeanUtil.copyObject(param, Contact.class);
		contact.setStatus(1);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<>(contactMapper.findPageInfo(contact));
	}

	@Override
	public List<Contact> findAll() {
		List<Contact> list = contactMapper.findPageInfo(new Contact());
		return list;
	}

	@Override
	public List<Contact> find(ContactSearchParam param) {
		Contact contact = BeanUtil.copyObject(param, Contact.class);
		List<Contact> list = contactMapper.findPageInfo(contact);
		return list;
	}

	@Override
	public Contact findById(Integer id) {
		return contactMapper.findById(id);
	}

	@Override
	public Contact insert(ContactParam param){
		Contact contact = BeanUtil.copyObject(param, Contact.class);
		contact.setCreateBy(UserContextHolder.getInstance().getUserId());
		contact.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = contactMapper.insert(contact);
        if(count == 0){
            return null;
        }
        return contact;
	}

    @Override
	public Contact update(ContactParam param) {
		Contact contact = BeanUtil.copyObject(param, Contact.class);
		contact.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = contactMapper.update(contact);
		if(count == 0){
            return null;
        }
        return contact;
	}

    @Override
    public int deleteById(Integer id) {
    	Contact contact=new Contact();
		contact.setId(id);
		contact.setUpdateBy(UserContextHolder.getInstance().getUserId());
    	return contactMapper.delete(contact);
    }

	@Transactional
	@Override
	public void deleteBatch(Integer[] ids) {
		for (Integer id : ids) {
			deleteById(id);
		}
	}

}
