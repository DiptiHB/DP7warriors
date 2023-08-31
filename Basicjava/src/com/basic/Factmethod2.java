package com.basic;

public class Factmethod2 {
	
	static long factNumber(int n)
	{
		
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;//it should be last statement.
		
	}
	public static void main(String args[])
	{
		long ans;
		ans=factNumber(7);
		System.out.println("the factorial of 7 is: "+ans);
		ans=factNumber(5);
		System.out.println("the factorial of 5 is: "+ans);
		System.out.println("the factorial of 9 is: "+factNumber(9));
	}


	
	

}
