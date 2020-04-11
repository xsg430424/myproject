package com.sfc.es.service;

import com.sfc.es.entity.param.AccountParam;
import com.sfc.es.entity.param.AccountSearchParam;
import com.sfc.es.entity.po.Account;
import com.sfc.es.utils.PageInfo;

import java.util.List;

/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface AccountService {
    PageInfo<Account> findPageInfo(AccountSearchParam param);
    List<Account> findAll();
    List<Account> find(AccountSearchParam param);
    Account findById(Integer id);
    Account insert(AccountParam param);
    Account update(AccountParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}