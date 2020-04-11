package com.sfc.es.service;

import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.AlertParam;
import com.sfc.es.entity.param.AlertSearchParam;
import com.sfc.es.entity.po.Alert;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface AlertService {
    PageInfo<Alert> findPageInfo(AlertSearchParam param, Page page);
    List<Alert> findAll();
    List<Alert> find(AlertSearchParam param);
    Alert findById(Integer id);
    Alert insert(AlertParam param);
    Alert update(AlertParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}