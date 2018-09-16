package com.zixuezhilu.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class ConnectionFactory {
	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	private static final ConnectionFactory CONNECTION_FACTORY = new ConnectionFactory();
	private static Connection conn = null;
	static {
		Properties pr = new Properties();
		
		try {
			
			InputStream  in = ConnectionFactory.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			pr.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = pr.getProperty("driver");
		dburl = pr.getProperty("dburl");
		user = pr.getProperty("user");
		password = pr.getProperty("password");
	}
	
	private ConnectionFactory() {
		
	}
	
	public static  ConnectionFactory getIntence() {
		return CONNECTION_FACTORY;
	}
	
	public Connection MakeConn() {
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dburl, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
