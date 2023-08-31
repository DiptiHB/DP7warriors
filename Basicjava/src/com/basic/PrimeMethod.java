package com.basic;

public class PrimeMethod {
	
	static boolean checkprime(int n)
	{
	    boolean flag=true;
	
	
		if(n==0 || (n==1))
		{
			flag=false;
		}
		else
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0);
				{
					flag=false;
					break;
				}
			}
		}
		return flag;
		
	}
 
	

	public static void main(String args[])
	{
		System.out.println(checkprime(2));
	}
}
