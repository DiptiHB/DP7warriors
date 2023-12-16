package com.callable;
//1.	WAP using JDBC to select and print all country names.
//2.	WAP using JDBC to select and print employee names along with their manager names.

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CountryName {
	Statement st;
	static Scanner sc=new Scanner(System.in);
	ResultSet rs;
	public Connection con=null;
	PreparedStatement pst;
	CallableStatement cst;
	CountryName()
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
	public void countrynames()
	{
		try {
			rs=st.executeQuery("select * from countries");
			while(rs.next())
			{
				System.out.println(rs.getString(2));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void employeeManagername()
	{
		try {
			rs=st.executeQuery("select e1.first_name as employee,e2.first_name as manager from employees e1 join employees e2 where e1.manager_id=e2.employee_id");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" --> "+rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void StoredProcedure()
	{
		try {
			
			System.out.println("Enter number : ");
			int num=sc.nextInt();
			cst=con.prepareCall("{call factorial(?,?)}");
			
			cst.setInt(1, num);
			
			cst.registerOutParameter(2, Types.INTEGER);
			System.out.println("before execute: ");
			cst.execute();
			System.out.println("Stored procedure execute sucessfully..");
			int i=cst.getInt(2);
			System.out.println(i);
			cst.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryName c=new CountryName();
		//c.countrynames();
		//c.employeeManagername();
		c.StoredProcedure();
	}

}
