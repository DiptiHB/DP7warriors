package com.custumexception2;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name: ");
		String name=sc.next();
		System.out.println("enter age: ");
		int age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new NotEligible("Sorry! You are not eligible..");
			}
			System.out.println(name+" thank you for precious vote!");
		}
		catch(NotEligible e)
		{
			System.out.println(e);
		}

	}

}
