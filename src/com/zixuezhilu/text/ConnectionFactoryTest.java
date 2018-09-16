package com.zixuezhilu.text;

import java.sql.Connection;

import com.zixuezhilu.util.ConnectionFactory;

public class ConnectionFactoryTest {
	public static void main(String[] args) {
		try {
			Connection conn;
			conn = ConnectionFactory.getIntence().MakeConn();
			System.out.println(conn.getAutoCommit());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
