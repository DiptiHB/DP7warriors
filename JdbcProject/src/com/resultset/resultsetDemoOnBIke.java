package com.resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc1.bikedbConnction;

public class resultsetDemoOnBIke {
	Statement st;
	static Scanner sc=new Scanner(System.in);
	ResultSet rs;
	public Connection con=null;
	resultsetDemoOnBIke()
	{
		con=bikedbConnction.getconnectto();
		try {
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("select * from model");
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
	public void viewDetails()
	{
		try {
			rs.beforeFirst();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertdata()
	{
	try {
		System.out.println("Enter bike id: ");
		int id=sc.nextInt();
		System.out.println("Enter bike name: ");
		String bName=sc.next();
		System.out.println("Enter cost :");
		int cost=sc.nextInt();
		rs.moveToInsertRow();
		rs.updateInt(1, id);
		rs.updateString(2, bName);
		rs.updateInt(3, cost);
		rs.insertRow();
		
	}	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public void deleteDetail()
	{
		System.out.println("Enter Bike Id to be deleted: ");
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
	public void updateBikeCost()
	{
		System.out.println("Enter bike id to be updated: ");
		int id=sc.nextInt();
		try {
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
					System.out.println("old cost "+rs.getInt(3));
					System.out.println("Enter new cost: ");
					int cost=sc.nextInt();
					rs.updateInt(3, cost);
					rs.updateRow();
				}
				{
					
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
		resultsetDemoOnBIke rb=new resultsetDemoOnBIke();
		int ch;
		char choice;
		do {
		System.out.println("What you want to perform of following? : ");
		System.out.println("1.show data ");
		System.out.println("2.insert  data ");
		System.out.println("3.delete data ");
		System.out.println("4.update cost ");
		System.out.println("5.search by bike id:  ");
		System.out.println("6.exit");
		System.out.println("enter your choice : ");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("you have selected 1.show bike details");
			rb.viewDetails();
			break;
		case 2:
			System.out.println("you have selected 2.insert bike");
			rb.insertdata();
			break;
		case 3: 
			System.out.println("you have selected 3.delete bike details");
			rb.deleteDetail();
			break;
		case 4:
			System.out.println("you have selected 4.update bike cost");
			rb.updateBikeCost();
			break;
		case 5: System.out.println("enter course id you want to search :");
				int id=sc.nextInt();
				//m1.searchBikebyId(id);
				break;
		
		case 6: System.exit(0);
		
		default:
				System.out.println("Something went wrong :(");
		}
		System.out.println("Do you want to perform operation ? y=Yes/n-No");
		choice=sc.next().charAt(0);
		
		}while(choice=='y'|| choice=='Y');
	}

}
