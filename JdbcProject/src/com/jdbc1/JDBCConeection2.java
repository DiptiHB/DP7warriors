package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConeection2 {
	public static Connection con=null;
	public static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL ="jdbc:mysql://localhost:3306/teacherdb";
	
	public static Connection getconnections()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teacherdb", "root","root");
			System.out.println("connection established...");
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		return con;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getconnections();

	}

}
