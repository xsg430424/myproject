package com.sfc.es.service;

import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.AlertParam;
import com.sfc.es.entity.param.AlertSearchParam;
import com.sfc.es.entity.po.Alert;
import com.sfc.es.utils.PageInfo;

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
