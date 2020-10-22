package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.conn.MyConn;
import com.dto.User;

public class UserDaoImple implements UserDao{
	private MyConn myConn;
	public UserDaoImple() {
		myConn = new MyConn();
	}

	@Override
	public int insertUser(User user) {
		int i = 0;
		
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("insert into logn (name, username, password) values (?, ?, ?)");
			s.setString(1, user.getName());
			s.setString(2, user.getUserName());
			s.setString(3, user.getUserPass());
			i = s.executeUpdate();
			s.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public boolean login(User user) {
	boolean flag = false;
		
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from logn where username=? and password=? ");
			
			s.setString(1, user.getUserName());
			s.setString(2, user.getUserPass());
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				flag = true;
			}
			s.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public ArrayList<User> selectAll(String username) {
		ArrayList<User> ar = new ArrayList<>();
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from logn  where  username=?");
			s.setString(1, username);
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				User ux = new User();
				ux.setName(rs.getString("name"));
				ux.setName(rs.getString("username"));
				ux.setName(rs.getString("password"));
				ar.add(ux);
			}
			s.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ar;
	}

	

}
