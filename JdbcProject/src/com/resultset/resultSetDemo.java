package com.resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc1.DBConnection;


public class resultSetDemo {
	Statement st;
	static Scanner sc=new Scanner(System.in);
	ResultSet rs;
	public Connection con=null;
	public resultSetDemo() {
		con=DBConnection.getconnected();
		try {
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			//st=con.createStatement();
			rs=st.executeQuery("select * from course");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void fetchdetails()
	{
		try {
			rs.beforeFirst();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	} 
	public void fetchDetailsBackward()
	{
		try {
			rs.afterLast();
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertDetails()
	{
		try {
		rs.moveToInsertRow();
		System.out.println("Enter course id: ");
		int id=sc.nextInt();
		System.out.println("Enter course name: ");
		String cName=sc.next();
		System.out.println("Enter duration: ");
		int duration=sc.nextInt();
		System.out.println("Enter fees:");
		int fees=sc.nextInt();
		rs.updateInt(1, id);
		rs.updateString(2, cName);
		rs.updateInt(3, duration);
		rs.updateInt(4, fees);
		rs.insertRow();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void deleteDetails()
	{
		System.out.println("Enter Courseid to be deleted: ");
		int id=sc.nextInt();
		try {
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
					rs.deleteRow();
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void updateDetails()
	{
		System.out.println("Enter course name to be updated: ");
		String cName=sc.next();
		try {
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getString(2).equals(cName))
				{
					System.out.println("old fees: "+rs.getFloat(4));
					System.out.println("Enter the new fees: ");
					float fees=sc.nextFloat();
					
					rs.updateFloat(4, fees);
					rs.updateRow();
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
		resultSetDemo r1=new resultSetDemo();
		int ch;
		char choice;
		do {
		System.out.println("What you want to perform of following? : ");
		System.out.println("1.show data ");
		System.out.println("2.insert  data ");
		System.out.println("3.delete data ");
		System.out.println("4.update fees ");
		System.out.println("5.search by course id:  ");
		System.out.println("6.fetch details backward");
		System.out.println("enter your choice : ");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("you have selected 1.show data");
			r1.fetchdetails();
			break;
		case 2:
			System.out.println("you have selected 2.insert  data");
			r1.insertDetails();
			break;
		case 3: 
			System.out.println("you have selected 3.delete data");
			r1.deleteDetails();
			break;
		case 4:
			System.out.println("you have selected 4.update fees");
			r1.updateDetails();
			break;
		case 5: System.out.println("enter course id you  want to search :");
				int id=sc.nextInt();
				//f1.searchCoursebyId(id);
				break;
		case 6:
			System.out.println("data in decending order..");
			r1.fetchDetailsBackward();
		
		//case 6: System.exit(0);
		
		default:
				System.out.println("Something went wrong :(");
		}
		System.out.println("Do you want to perform operation ? y=Yes/n-No");
		choice=sc.next().charAt(0);
		
		}while(choice=='y'|| choice=='Y');
	}

}
