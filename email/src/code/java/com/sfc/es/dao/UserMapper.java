package com.sfc.es.dao;

import com.sfc.es.entity.po.User;
import java.util.List;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface UserMapper {
    List<User> findPageInfo(User user);
    User findById(Integer id);
    int insert(User user);
    int insertBatch(List<User> list);
    int update(User user);
    int delete(User user);
}