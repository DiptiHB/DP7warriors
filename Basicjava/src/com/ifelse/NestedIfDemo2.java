package com.ifelse;

import java.util.Scanner;

public class NestedIfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your percentage: ");
		double per=sc.nextDouble();
		if(per>65)
		{
			System.out.println("you are eligible for admission..!");
			if(per>80)
			{
				System.out.println("you have option to choose from science and commerce");	
			}
			else 
			{
				System.out.println("you have only commerce as option ");
			}
			
		}
		else
		{
			System.out.println("you are NOT eligible for admission..!");
		}
		sc.close();

	}

}
