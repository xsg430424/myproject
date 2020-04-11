package com.sfc.es.service.impl;

import com.github.pagehelper.PageHelper;
import com.sfc.common.core.util.UserContextHolder;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.dao.BirthdayMapper;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.BirthdayParam;
import com.sfc.es.entity.param.BirthdaySearchParam;
import com.sfc.es.entity.po.Birthday;
import com.sfc.es.service.BirthdayService;
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
public class BirthdayServiceImpl implements BirthdayService {
	@Autowired
	private BirthdayMapper birthdayMapper;

	@Override
	public PageInfo<Birthday> findPageInfo(BirthdaySearchParam param, Page page) {
		Birthday birthday = BeanUtil.copyObject(param, Birthday.class);
		birthday.setStatus(1);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<>(birthdayMapper.findPageInfo(birthday));
	}

	@Override
	public List<Birthday> findAll() {
		List<Birthday> list = birthdayMapper.findPageInfo(new Birthday());
		return list;
	}

	@Override
	public List<Birthday> find(BirthdaySearchParam param) {
		Birthday birthday = BeanUtil.copyObject(param, Birthday.class);
		List<Birthday> list = birthdayMapper.findPageInfo(birthday);
		return list;
	}

	@Override
	public Birthday findById(Integer id) {
		return birthdayMapper.findById(id);
	}

	@Override
	public Birthday insert(BirthdayParam param){
		Birthday birthday = BeanUtil.copyObject(param, Birthday.class);
		birthday.setCreateBy(UserContextHolder.getInstance().getUserId());
		birthday.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = birthdayMapper.insert(birthday);
        if(count == 0){
            return null;
        }
        return birthday;
	}

    @Override
	public Birthday update(BirthdayParam param) {
		Birthday birthday = BeanUtil.copyObject(param, Birthday.class);
		birthday.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = birthdayMapper.update(birthday);
		if(count == 0){
            return null;
        }
        return birthday;
	}

    @Override
    public int deleteById(Integer id) {
    	Birthday birthday=new Birthday();
		birthday.setId(id);
		birthday.setUpdateBy(UserContextHolder.getInstance().getUserId());
    	return birthdayMapper.delete(birthday);
    }

	@Transactional
	@Override
	public void deleteBatch(Integer[] ids) {
		for (Integer id : ids) {
			deleteById(id);
		}
	}

}
