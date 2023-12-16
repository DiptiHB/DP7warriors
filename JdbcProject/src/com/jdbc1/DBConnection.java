package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection conn=null;
	public static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	
	public static Connection getconnected()
	{
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver loaded....");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase", "root", "root");
			System.out.println("connection established...");
		}
		catch (Exception e){
			System.out.println(e);
			
		}
		return conn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getconnected();
	}

}
