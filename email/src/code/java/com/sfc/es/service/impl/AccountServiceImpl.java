package com.sfc.es.service.impl;

import com.github.pagehelper.PageHelper;
import com.sfc.common.core.util.UserContextHolder;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.dao.AccountMapper;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.AccountParam;
import com.sfc.es.entity.param.AccountSearchParam;
import com.sfc.es.entity.po.Account;
import com.sfc.es.service.AccountService;
import com.sfc.es.util.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountMapper accountMapper;

	@Override
	public PageInfo<Account> findPageInfo(AccountSearchParam param, Page page) {
		Account account = BeanUtil.copyObject(param, Account.class);
		account.setStatus(1);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<>(accountMapper.findPageInfo(account));
	}

	@Override
	public List<Account> findAll() {
		List<Account> list = accountMapper.findPageInfo(new Account());
		return list;
	}

	@Override
	public List<Account> find(AccountSearchParam param) {
		Account account = BeanUtil.copyObject(param, Account.class);
		List<Account> list = accountMapper.findPageInfo(account);
		return list;
	}

	@Override
	public Account findById(Integer id) {
		return accountMapper.findById(id);
	}

	@Override
	public Account insert(AccountParam param){
		Account account = BeanUtil.copyObject(param, Account.class);
		account.setCreateBy(UserContextHolder.getInstance().getUserId());
		account.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = accountMapper.insert(account);
        if(count == 0){
            return null;
        }
        return account;
	}

    @Override
	public Account update(AccountParam param) {
		Account account = BeanUtil.copyObject(param, Account.class);
		account.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = accountMapper.update(account);
		if(count == 0){
            return null;
        }
        return account;
	}

    @Override
    public int deleteById(Integer id) {
    	Account account=new Account();
		account.setId(id);
		account.setUpdateBy(UserContextHolder.getInstance().getUserId());
    	return accountMapper.delete(account);
    }

	@Transactional
	@Override
	public void deleteBatch(Integer[] ids) {
		for (Integer id : ids) {
			deleteById(id);
		}
	}

}
