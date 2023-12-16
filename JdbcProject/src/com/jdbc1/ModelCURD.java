package com.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModelCURD {
	static Scanner sc=new Scanner(System.in);
	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	public ModelCURD()
	{
		con=bikedbConnction.getconnectto();
		System.out.println("Connection done.....");
		try {
			st= con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	public void ModelDetails()
	{
		try {
			rs=st.executeQuery("select * from model");
			System.out.println("-----Bike Model-----------");
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
	public void insertBike()
	{
		System.out.println("Enter bike id: ");
		int id=sc.nextInt();
		System.out.println("Enter bike name: ");
		String bName=sc.next();
		System.out.println("Enter cost :");
		int cost=sc.nextInt();
		try {
			pst=con.prepareStatement("insert into model values(?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, bName);
			pst.setInt(3, cost);
			
			int noOfRowsInserted= pst.executeUpdate();
			if(noOfRowsInserted>0)
			{
				System.out.println("Bike added.....");
				ModelDetails();
			}
			else
			{
				System.out.println("Error in course....");
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void deleteBike()
	{
		System.out.println("Enter Bikeid to be deleted: ");
		int id=sc.nextInt();
		
		try {
			pst=con.prepareStatement("delete from model where modelId=?");
			pst.setInt(1, id);
			int noOfRowsDeleted=pst.executeUpdate();
			if(noOfRowsDeleted>0)
			{
				System.out.println("Model "+id+" is deleted..");
				ModelDetails();
			}
			else {
				System.out.println("SORRY!error in deletion course! ");
			}
			
		}
		catch (Exception e){
			System.out.println(e);
			
		}
	}
	public boolean searchBikebyId(int id)
	{
		boolean isfound=false;
		try {
			pst=con.prepareStatement("select * from model where modelId=?");
			pst.setInt(1, id);
			rs=pst.executeQuery();
			while(rs.next())
			{
				isfound=true;
				System.out.println("model id: "+rs.getInt(1));
				System.out.println("model name: "+rs.getString(2));
				System.out.println("cost: "+rs.getInt(3));
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return isfound;
	}
	public void updateBikeCost()
	{
		System.out.println("Enter Bike id :");
		int id=sc.nextInt();
		if(searchBikebyId(id))
		{
			System.out.println("Enter new cost: ");
			int cost=sc.nextInt();
			try {
				pst=con.prepareStatement("update model set cost=? where modelId=?");
				pst.setFloat(1, cost);
				pst.setInt(2, id);
				int noOfRowsUpdated=pst.executeUpdate();
				if(noOfRowsUpdated>0)
				{
					System.out.println("Bike cost Updated..");
					searchBikebyId(id);
				}
				else
				{
					System.out.println("OOPS!error in updating bike details!");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModelCURD m1=new ModelCURD();
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
			m1.ModelDetails();
			break;
		case 2:
			System.out.println("you have selected 2.insert bike");
			m1.insertBike();
			break;
		case 3: 
			System.out.println("you have selected 3.delete bike details");
			m1.deleteBike();
			break;
		case 4:
			System.out.println("you have selected 4.update bike cost");
			m1.updateBikeCost();
			break;
		case 5: System.out.println("enter course id you want to search :");
				int id=sc.nextInt();
				m1.searchBikebyId(id);
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
