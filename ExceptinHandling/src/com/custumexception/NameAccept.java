package com.custumexception;

import java.util.Scanner;

public class NameAccept   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();
		try
		{
			if(name.length()<3)
			{
				throw new InvalidNameException("name should be greater than 2 charaters");
				
			}
			System.out.println("hello "+name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
