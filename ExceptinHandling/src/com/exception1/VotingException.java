package com.exception1;

import java.util.Scanner;

public class VotingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age: ");
		int age;
		try
		{
			age=sc.nextInt();
			if(age>18)
			{
				System.out.println("eligible for vote.");
			}
			else
			{
				System.out.println("not eligible for vote.");
			}
			//System.out.println("thanks for voting");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
			System.out.println("thank you for your response");
		}
	}

}
