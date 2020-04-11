package com.sfc.es.dao;

import com.sfc.es.entity.po.Account;
import java.util.List;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface AccountMapper {
    List<Account> findPageInfo(Account account);
    Account findById(Integer id);
    int insert(Account account);
    int insertBatch(List<Account> list);
    int update(Account account);
    int delete(Account account);
}