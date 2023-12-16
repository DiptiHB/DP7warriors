package com.exception1;

import java.util.Scanner;

public class nestedTrybolck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter number: ");
			arr[i]=sc.nextInt();
		}
		try
		{
		 for(int i=0;i<=arr.length;i++)
		 {
			try
			{
			System.out.println("Ans: "+(100/arr[i]));	
			}
			catch(ArithmeticException e)
			{
				System.out.println(e+" :can not divide by zero");
			}
			
		 }
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+" :index out of bound");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
			System.out.println("Scanner is closed");
			
		}

	}

}
