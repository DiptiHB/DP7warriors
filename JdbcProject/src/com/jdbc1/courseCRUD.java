package com.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class courseCRUD {
	static Scanner sc=new Scanner(System.in);
	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	public courseCRUD()
	{
		con= DBConnection.getconnected();
		System.out.println("Connection done.....");
		try {
			st= con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	public void fetchCourseDetails()
	{
		try {
			rs=st.executeQuery("select * from course");
			System.out.println("-----Courses-----------");
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
	public void insertCourse()
	{
		System.out.println("Enter course id: ");
		int id=sc.nextInt();
		System.out.println("Enter course name: ");
		String cName=sc.next();
		System.out.println("Enter duration: ");
		int duration=sc.nextInt();
		System.out.println("Enter fees:");
		int fees=sc.nextInt();
		try {
			pst=con.prepareStatement("insert into course values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, cName);
			pst.setInt(3, duration);
			pst.setFloat(4, fees);
			
			int noOfRowsInserted= pst.executeUpdate();
			if(noOfRowsInserted>0)
			{
				System.out.println("Course added.....");
				fetchCourseDetails();
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
	public void deleteCourse()
	{
		System.out.println("Enter Courseid to be deleted: ");
		int id=sc.nextInt();
		
		try {
			pst=con.prepareStatement("delete from course where cId=?");
			pst.setInt(1, id);
			int noOfRowsDeleted=pst.executeUpdate();
			if(noOfRowsDeleted>0)
			{
				System.out.println("Course "+id+" is deleted..");
				fetchCourseDetails();
			}
			else {
				System.out.println("SORRY!error in deletion course! ");
			}
			
		}
		catch (Exception e){
			System.out.println(e);
			
		}
	}
	public boolean searchCoursebyId(int id)
	{
		boolean isfound=false;
		try {
			pst=con.prepareStatement("select * from course where cId=?");
			pst.setInt(1, id);
			rs=pst.executeQuery();
			while(rs.next())
			{
				isfound=true;
				System.out.println("course id: "+rs.getInt(1));
				System.out.println("course name: "+rs.getString(2));
				System.out.println("Duration: "+rs.getInt(3));
				System.out.println("fees: "+rs.getInt(4));
				//System.out.println("no of stud: "+rs.getInt(5));
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return isfound;
	}
	public void updateCourseFees()
	{
		System.out.println("Enter course :");
		int id=sc.nextInt();
		if(searchCoursebyId(id))
		{
			System.out.println("Enter new fees: ");
			float fees=sc.nextFloat();
			try {
				pst=con.prepareStatement("update course set fees=? where cid=?");
				pst.setFloat(1, fees);
				pst.setInt(2, id);
				int noOfRowsUpdated=pst.executeUpdate();
				if(noOfRowsUpdated>0)
				{
					System.out.println("Course Updated..");
					searchCoursebyId(id);
				}
				else
				{
					System.out.println("OOPS!error in updating course!");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		courseCRUD f1= new courseCRUD();
		int ch;
		char choice;
		do {
		System.out.println("What you want to perform of following? : ");
		System.out.println("1.show data ");
		System.out.println("2.insert  data ");
		System.out.println("3.delete data ");
		System.out.println("4.update fees ");
		System.out.println("5.search by course id:  ");
		System.out.println("6.exit");
		System.out.println("enter your choice : ");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("you have selected 1.show data");
			f1.fetchCourseDetails();
			break;
		case 2:
			System.out.println("you have selected 2.insert  data");
			f1.insertCourse();
			break;
		case 3: 
			System.out.println("you have selected 3.delete data");
			f1.deleteCourse();
			break;
		case 4:
			System.out.println("you have selected 4.update fees");
			f1.updateCourseFees();
			break;
		case 5: System.out.println("enter course id you  want to search :");
				int id=sc.nextInt();
				f1.searchCoursebyId(id);
				break;
		
		case 6: System.exit(0);
		
		default:
				System.out.println("Something went wrong :(");
		}
		System.out.println("Do you want to perform operation ? y=Yes/n-No");
		choice=sc.next().charAt(0);
		
		}while(choice=='y'|| choice=='Y');
		
		
		//courseCRUD f1= new courseCRUD();
		//f1.fetchCourseDetails();
	    //f1.insertCourse();
		//f1.searchCoursebyId(id);
		//f1.deleteCourse();
		//f1.updateCourseFees();

	}

}
