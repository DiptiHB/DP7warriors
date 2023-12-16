package com.exception1;

import java.util.Scanner;

public class RangeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
			try
			{
				if(num>1000)
				{
				throw new OutOfRangeExcept("number is greater than 1000");	
				}
			}
			catch(OutOfRangeExcept e)
			{
				System.out.println(e.getMessage());
			}
			
		

	}

}
