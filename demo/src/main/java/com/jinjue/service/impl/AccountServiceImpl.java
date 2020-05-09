package com.jinjue.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinjue.common.utils.BeanUtil;
import com.jinjue.common.utils.PageInfo;
import com.jinjue.common.utils.UserContextHolder;
import com.jinjue.dao.AccountMapper;
import com.jinjue.po.Account;
import com.jinjue.service.AccountService;
import com.jinjue.vo.request.AccountParam;
import com.jinjue.vo.request.AccountSearchParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
	public PageInfo<Account> findPageInfo(AccountSearchParam param) {
		Account account = BeanUtil.copyObject(param, Account.class);
		account.setStatus(1);
		PageHelper.startPage(param.getPageNum(), param.getPageSize());
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
		account.setAccountId(id);
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
