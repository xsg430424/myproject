package com.sfc.es.dao;

import com.sfc.es.entity.po.Contact;
import java.util.List;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface ContactMapper {
    List<Contact> findPageInfo(Contact contact);
    Contact findById(Integer id);
    int insert(Contact contact);
    int insertBatch(List<Contact> list);
    int update(Contact contact);
    int delete(Contact contact);
}