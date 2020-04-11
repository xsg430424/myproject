package com.sfc.es.service.impl;

import com.github.pagehelper.PageHelper;
import com.sfc.common.core.util.UserContextHolder;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.dao.AlertMapper;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.AlertParam;
import com.sfc.es.entity.param.AlertSearchParam;
import com.sfc.es.entity.po.Alert;
import com.sfc.es.service.AlertService;
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
public class AlertServiceImpl implements AlertService {
	@Autowired
	private AlertMapper alertMapper;

	@Override
	public PageInfo<Alert> findPageInfo(AlertSearchParam param, Page page) {
		Alert alert = BeanUtil.copyObject(param, Alert.class);
		alert.setStatus(1);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<>(alertMapper.findPageInfo(alert));
	}

	@Override
	public List<Alert> findAll() {
		List<Alert> list = alertMapper.findPageInfo(new Alert());
		return list;
	}

	@Override
	public List<Alert> find(AlertSearchParam param) {
		Alert alert = BeanUtil.copyObject(param, Alert.class);
		List<Alert> list = alertMapper.findPageInfo(alert);
		return list;
	}

	@Override
	public Alert findById(Integer id) {
		return alertMapper.findById(id);
	}

	@Override
	public Alert insert(AlertParam param){
		Alert alert = BeanUtil.copyObject(param, Alert.class);
		alert.setCreateBy(UserContextHolder.getInstance().getUserId());
		alert.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = alertMapper.insert(alert);
        if(count == 0){
            return null;
        }
        return alert;
	}

    @Override
	public Alert update(AlertParam param) {
		Alert alert = BeanUtil.copyObject(param, Alert.class);
		alert.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = alertMapper.update(alert);
		if(count == 0){
            return null;
        }
        return alert;
	}

    @Override
    public int deleteById(Integer id) {
    	Alert alert=new Alert();
		alert.setId(id);
		alert.setUpdateBy(UserContextHolder.getInstance().getUserId());
    	return alertMapper.delete(alert);
    }

	@Transactional
	@Override
	public void deleteBatch(Integer[] ids) {
		for (Integer id : ids) {
			deleteById(id);
		}
	}

}
