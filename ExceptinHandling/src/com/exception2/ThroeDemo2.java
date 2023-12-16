package com.exception2;

import java.util.Scanner;

public class ThroeDemo2 {
	static Scanner sc=new Scanner (System.in);
	static void enterDetails()
	{
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("enter marks: ");
		try
		{
		int marks=sc.nextInt();
		if(marks<0)
		{
			throw new RuntimeException("marks should be greater than zero ");
		}
		else
		{
			if(marks>40)
			{
				System.out.println(name+" has been cleared the exam with marks "+marks);
			}
			else
			{
				System.out.println(name+" has been fail! you can do it FIGHTING:) ");
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
		enterDetails();
	}

}
