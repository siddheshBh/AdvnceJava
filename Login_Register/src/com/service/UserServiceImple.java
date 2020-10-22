package com.service;

import java.util.ArrayList;

import com.dao.UserDao;
import com.dao.UserDaoImple;
import com.dto.User;

public class UserServiceImple implements UserService{
	private UserDao userDao;
	public UserServiceImple() {
		userDao = new UserDaoImple();
	}

	@Override
	public int registerUser(User user) {
		
		return userDao.insertUser(user);
	}

	@Override
	public boolean login(User user) {

		return userDao.login(user);
	}
	
	public ArrayList<User> seAll(String username){
		return userDao.selectAll(username);
	}

}
