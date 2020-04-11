package com.sfc.es.service;

import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.UserParam;
import com.sfc.es.entity.param.UserSearchParam;
import com.sfc.es.entity.po.User;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface UserService {
    PageInfo<User> findPageInfo(UserSearchParam param, Page page);
    List<User> findAll();
    List<User> find(UserSearchParam param);
    User findById(Integer id);
    User insert(UserParam param);
    User update(UserParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}