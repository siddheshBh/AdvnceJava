package com.service;

import java.util.ArrayList;

import com.dto.User;

public interface UserService {
	int registerUser(User user);
	boolean login (User user);
	ArrayList<User> seAll(String username);

}
