package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StoredProcedureCall {
	Statement st;
	static Scanner sc=new Scanner(System.in);
	CallableStatement cst;
	ResultSet rs;
	public Connection con=null;
	public StoredProcedureCall() {
		con=companydb.getconnected();
		try {
			st=con.createStatement();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void getEmployeeDetails()
	{
		try {
			cst=con.prepareCall("{call empDetails}");
			boolean status=cst.execute();
			if(status)
			{
				rs=cst.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void getDeptWiseSalary()
	{
		System.out.println("Enter employee id: ");
		int id=sc.nextInt();
		try {
			
			cst=con.prepareCall("{call deptwisesal (?,?)}");
			cst.setInt(1, id);
			cst.registerOutParameter(1, id);
			
			
			boolean status=cst.execute();
			if(status)
			{
				rs=cst.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StoredProcedureCall s1=new StoredProcedureCall();
     s1.getEmployeeDetails();
	}

}
