package com.zixuezhilu.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zixuezhilu.dao.UserDao;
import com.zixuezhilu.dao.impl.UserDaoImpl;
import com.zixuezhilu.entity.User;
import com.zixuezhilu.util.ConnectionFactory;

public class CheckUserService {
	private UserDao userDao = new UserDaoImpl();
	public boolean Check(User user) {
		Connection conn = null;
		try {
			 conn = ConnectionFactory.getIntence().MakeConn();
			ResultSet res = userDao.get(conn, user);
			while (res.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	
	

}
