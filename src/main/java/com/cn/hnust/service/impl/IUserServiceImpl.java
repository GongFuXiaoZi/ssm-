package com.cn.hnust.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Service("userService")
public class IUserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		
		return userDao.selectByPrimaryKey(userId);
	}

}