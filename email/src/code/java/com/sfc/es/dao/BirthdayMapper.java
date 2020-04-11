package com.sfc.es.dao;

import com.sfc.es.entity.po.Birthday;
import java.util.List;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface BirthdayMapper {
    List<Birthday> findPageInfo(Birthday birthday);
    Birthday findById(Integer id);
    int insert(Birthday birthday);
    int insertBatch(List<Birthday> list);
    int update(Birthday birthday);
    int delete(Birthday birthday);
}