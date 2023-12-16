package com.exception1;

public class ReturnType {
	static int method(int data) 
	{
	try
	{
		return 30/data;
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return 0;
	}
	
	static int method2(int data) 
	{
	try
	{
		return 30/data;
		
	}
	catch(Exception e)
	{
		System.out.println(e);
		return 0;
	}
	
	}
	static int method3(int data) 
	{
	try
	{
		return 30/data;
		
	}
	catch(Exception e)
	{
		System.out.println(e);
		
	}
	finally
	{
		return -1;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method(2));
		System.out.println(method2(0));
		System.out.println(method3(0));
		
     
	}

}
