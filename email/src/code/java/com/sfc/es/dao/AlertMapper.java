package com.sfc.es.dao;

import com.sfc.es.entity.po.Alert;
import java.util.List;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface AlertMapper {
    List<Alert> findPageInfo(Alert alert);
    Alert findById(Integer id);
    int insert(Alert alert);
    int insertBatch(List<Alert> list);
    int update(Alert alert);
    int delete(Alert alert);
}