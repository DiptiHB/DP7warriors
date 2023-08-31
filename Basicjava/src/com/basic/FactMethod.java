package com.basic;



public class FactMethod {

	
		// TODO Auto-generated method stub
		static void factNumber(int n)
		{
			
			long fact=1;
			for(int i=1;i<=n;i++)
			{
				fact*=i;
			}
			System.out.println("factorial of number is: "+fact);
			
		}
		public static void main(String args[])
		{
			factNumber(7);
			factNumber(5);
		}

	

}
