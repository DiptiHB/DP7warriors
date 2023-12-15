package com.test;

import com.pojo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.databaseconnect.*;

public class testWithdb {
	static Scanner sc=new Scanner(System.in);
	static Connection con=null;
	Statement st;
	ResultSet rs;
	    private List<User> users;
	    private List<Account> accounts;
	    private List<Transaction> transactions;
	    private User currentUser; 
	PreparedStatement pst;
	 
	public testWithdb()  {
	        users = new ArrayList<>();
	        accounts = new ArrayList<>();
	        transactions = new ArrayList<>();
	       
	        con= BankDBConnect.getconnected();
			System.out.println("Connection done.....");
			try {
				st= con.createStatement();
			} catch (SQLException e) {
				System.out.println(e);
			}
	    }
	 public void signUp(User user) {
	       users.add(user);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
