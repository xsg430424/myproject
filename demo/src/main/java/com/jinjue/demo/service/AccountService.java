package com.jinjue.demo.service;


import com.jinjue.demo.common.utils.PageInfo;
import com.jinjue.demo.po.Account;
import com.jinjue.demo.vo.request.AccountParam;
import com.jinjue.demo.vo.request.AccountSearchParam;

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