package com.zixuezhilu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zixuezhilu.entity.User;

public interface  UserDao {
	public  ResultSet get(Connection conn,User user) throws SQLException;

}
