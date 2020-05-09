package com.jinjue.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinjue.demo.common.entity.Page;
import com.jinjue.demo.common.utils.BeanUtil;
import com.jinjue.demo.common.utils.PageInfo;
import com.jinjue.demo.common.utils.UserContextHolder;
import com.jinjue.demo.dao.AlertMapper;
import com.jinjue.demo.po.Alert;
import com.jinjue.demo.service.AlertService;
import com.jinjue.demo.vo.request.AlertParam;
import com.jinjue.demo.vo.request.AlertSearchParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Des:
 * @Date: 2019/06/30
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
    //    @Cacheable(value="position",key="#id",unless = "#result == null")
    public Alert findById(Integer id) {
        return alertMapper.findById(id);
    }

    @Override
//    @Caching(evict = {@CacheEvict(value = "position",key = "'upName'"),@CacheEvict(value = "position",key = "#id")})
    public int insert(AlertParam param){
        Alert alert = BeanUtil.copyObject(param, Alert.class);
        alert.setCreateBy(UserContextHolder.getInstance().getUserId());
        alert.setUpdateBy(UserContextHolder.getInstance().getUserId());
        return alertMapper.insert(alert);
    }

    @Override
//    @Caching(evict = {@CacheEvict(value = "position",key = "'upName'"),@CacheEvict(value = "position",key = "#id")})
    public int update(AlertParam param) {
        Alert alert = BeanUtil.copyObject(param, Alert.class);
        alert.setUpdateBy(UserContextHolder.getInstance().getUserId());
        return alertMapper.update(alert);
    }

    @Override
    //    @Caching(evict = {@CacheEvict(value = "position",key = "'upName'"),@CacheEvict(value = "position",key = "#id")})
    public int deleteById(Integer id) {
        Alert alert=new Alert();
        alert.setAlertId(id);
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
