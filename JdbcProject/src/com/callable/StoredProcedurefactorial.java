package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class StoredProcedurefactorial {
	Statement st;
	static Scanner sc=new Scanner(System.in);
	CallableStatement cst;
	ResultSet rs;
	public Connection con=null;
	public StoredProcedurefactorial()
	{
		con=companydb.getconnected();
	}
	public void StoredProcedure()
	{
		try {
			System.out.println("Enter id : ");
			int id=sc.nextInt();
			System.out.println("before call ");
			cst=con.prepareCall("{call factorial(?,?)}");
			System.out.println("after prepare call" + cst.isClosed());
			cst.setInt(1, id);
			//cst.registerOutParameter(2, java.sql.Types.INTEGER);
			
			System.out.println("before execute: ");
			cst.execute();
	
			System.out.println("Stored procedure execute sucessfully..");
			int i=cst.getInt(2);
			System.out.println(i);
			cst.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     StoredProcedurefactorial st=new StoredProcedurefactorial();
     st.StoredProcedure();
	}

}
