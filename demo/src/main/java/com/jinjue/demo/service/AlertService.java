package com.jinjue.demo.service;

import com.jinjue.demo.common.entity.Page;
import com.jinjue.demo.common.utils.PageInfo;
import com.jinjue.demo.po.Alert;
import com.jinjue.demo.vo.request.AlertParam;
import com.jinjue.demo.vo.request.AlertSearchParam;

import java.util.List;

/**
 * @Des:
 * @Date: 2019/06/30
 * @Author: Gavin Shaw
 */
public interface AlertService {
    PageInfo<Alert> findPageInfo(AlertSearchParam param, Page page);
    List<Alert> findAll();
    List<Alert> find(AlertSearchParam param);
    Alert findById(Integer id);
    int insert(AlertParam param);
    int update(AlertParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}
