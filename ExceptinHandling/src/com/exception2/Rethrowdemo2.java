package com.exception2;

public class Rethrowdemo2 {
	static void method()
	{
		
		try 
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException ex)
		{
		 System.out.println("in catch block of method");
		 throw ex;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
			method();//Exception in thread "main"
		
		

	}

}
