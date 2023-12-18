package com.databaseconnect;
import java.sql.*;
import java.util.*;
public class DBConnection {
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/ Money_BankDB";
	public static final String USER="root";
	public static final String PASSWORD="root";
	public static Connection con=null;
	public static Connection getConnect()
	{
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver loaded...");
			con=DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connection establised..");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getConnect();

	}

}
