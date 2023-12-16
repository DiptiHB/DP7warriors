package com.callable;

import java.sql.Connection;
import java.sql.DriverManager;

public class companydb {
	static Connection con=null;
	public static Connection getconnected()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded....");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/comapnydb", "root", "root");
			System.out.println("connection established...");
		}
		catch (Exception e){
			System.out.println(e);
			
		}
		return con;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getconnected();
	}

}
