package com.exception1;

public class FirstExceptionHandled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=10;
		try
		{
		int ans=(x+y)/(x-y);
		System.out.println(ans);
		}
		catch(Exception e)
		{
			System.out.println(e+" :divide by zero exception");
		}
		
		int result=(2*x)+(2*y);
		System.out.println(result);

	}

}
