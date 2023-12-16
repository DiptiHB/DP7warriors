package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class FunctionCall {
	Statement st;
	static Scanner sc=new Scanner(System.in);
	CallableStatement cst;
	ResultSet rs;
	public Connection con=null;
	public FunctionCall()
	{
		con=companydb.getconnected();
		try {
			st=con.createStatement();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void calTotalSalaryDeptWise()
	{
		System.out.println("Enter the dept id: ");
		int id=sc.nextInt();
		try {
			cst=con.prepareCall("{?=call.totalsalarydept(?)}");
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, id);
			boolean status=cst.execute();
			if(!status)
			{
				System.out.println("total salary of dept id "+id+ " is "+cst.getInt(1));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionCall f1=new FunctionCall();
		f1.calTotalSalaryDeptWise();
	}

}
