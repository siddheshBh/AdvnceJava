package com.dao;

import java.util.ArrayList;

import com.dto.User;

public interface UserDao {
	int insertUser(User user);
	boolean login(User user);
	ArrayList<User> selectAll(String username);
}
