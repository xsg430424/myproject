package com.sfc.es.service.impl;

import com.github.pagehelper.PageHelper;
import com.sfc.common.core.util.UserContextHolder;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.dao.UserMapper;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.UserParam;
import com.sfc.es.entity.param.UserSearchParam;
import com.sfc.es.entity.po.User;
import com.sfc.es.service.UserService;
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
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public PageInfo<User> findPageInfo(UserSearchParam param, Page page) {
		User user = BeanUtil.copyObject(param, User.class);
		user.setStatus(1);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<>(userMapper.findPageInfo(user));
	}

	@Override
	public List<User> findAll() {
		List<User> list = userMapper.findPageInfo(new User());
		return list;
	}

	@Override
	public List<User> find(UserSearchParam param) {
		User user = BeanUtil.copyObject(param, User.class);
		List<User> list = userMapper.findPageInfo(user);
		return list;
	}

	@Override
	public User findById(Integer id) {
		return userMapper.findById(id);
	}

	@Override
	public User insert(UserParam param){
		User user = BeanUtil.copyObject(param, User.class);
		user.setCreateBy(UserContextHolder.getInstance().getUserId());
		user.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = userMapper.insert(user);
        if(count == 0){
            return null;
        }
        return user;
	}

    @Override
	public User update(UserParam param) {
		User user = BeanUtil.copyObject(param, User.class);
		user.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = userMapper.update(user);
		if(count == 0){
            return null;
        }
        return user;
	}

    @Override
    public int deleteById(Integer id) {
    	User user=new User();
		user.setId(id);
		user.setUpdateBy(UserContextHolder.getInstance().getUserId());
    	return userMapper.delete(user);
    }

	@Transactional
	@Override
	public void deleteBatch(Integer[] ids) {
		for (Integer id : ids) {
			deleteById(id);
		}
	}

}
