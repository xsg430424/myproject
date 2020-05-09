package com.sfc.es.service;

import com.jinjue.common.entity.Page;
import com.jinjue.common.utils.PageInfo;
import com.jinjue.po.Alert;
import com.jinjue.vo.request.AlertParam;
import com.jinjue.vo.request.AlertSearchParam;

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
