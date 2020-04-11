package com.sfc.es.service;

import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.ContactParam;
import com.sfc.es.entity.param.ContactSearchParam;
import com.sfc.es.entity.po.Contact;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface ContactService {
    PageInfo<Contact> findPageInfo(ContactSearchParam param, Page page);
    List<Contact> findAll();
    List<Contact> find(ContactSearchParam param);
    Contact findById(Integer id);
    Contact insert(ContactParam param);
    Contact update(ContactParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}