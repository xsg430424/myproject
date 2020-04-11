package com.sfc.es.service;

import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.AccountParam;
import com.sfc.es.entity.param.AccountSearchParam;
import com.sfc.es.entity.po.Account;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface AccountService {
    PageInfo<Account> findPageInfo(AccountSearchParam param, Page page);
    List<Account> findAll();
    List<Account> find(AccountSearchParam param);
    Account findById(Integer id);
    Account insert(AccountParam param);
    Account update(AccountParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}