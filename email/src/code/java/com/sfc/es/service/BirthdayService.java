package com.sfc.es.service;

import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.BirthdayParam;
import com.sfc.es.entity.param.BirthdaySearchParam;
import com.sfc.es.entity.po.Birthday;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface BirthdayService {
    PageInfo<Birthday> findPageInfo(BirthdaySearchParam param, Page page);
    List<Birthday> findAll();
    List<Birthday> find(BirthdaySearchParam param);
    Birthday findById(Integer id);
    Birthday insert(BirthdayParam param);
    Birthday update(BirthdayParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}