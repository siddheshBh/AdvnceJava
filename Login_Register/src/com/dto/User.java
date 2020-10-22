package com.dto;

public class User {

	private String userName;
	private String userPass;
	private String name;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String userPass, String name) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPass=" + userPass + ", name=" + name + "]";
	}
	
	
}
