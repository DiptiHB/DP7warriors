package com.exception1;

import java.util.Scanner;

public class MultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter number: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Ans: "+(100/arr[i]));	
		}
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
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
