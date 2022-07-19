package com.techbook.service;

import com.techbook.dao.UserDao;
import com.techbook.dao.UserDaoImpl;
import com.techbook.domain.User;

public class StudentServiceImpl implements StudentService {
	
	
	private UserDao userDao; 
	
	public StudentServiceImpl() {
		userDao = new UserDaoImpl();
	}
	
	
	@Override
	public int saveUserInfo(User user) {
		return userDao.saveUserInfo(user);
		
	}
	
}
