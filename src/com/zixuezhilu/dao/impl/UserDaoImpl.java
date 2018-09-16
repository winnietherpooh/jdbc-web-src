package com.zixuezhilu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zixuezhilu.dao.UserDao;
import com.zixuezhilu.entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public ResultSet get(Connection conn, User user) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select * from web_user where user_name = ? and password = ?");
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getPassWorld());
		
		return ps.executeQuery();
	}

	

}
