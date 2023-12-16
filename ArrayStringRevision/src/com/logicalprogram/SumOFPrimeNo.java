package com.logicalprogram;

public class SumOFPrimeNo {
	public static void sumOFPrime(int n)
	{
		int sum=0;
		for(int i=2;i<=n;i++)
		{
			boolean checkprime=true;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					checkprime=false;
					break;
				}
			}
			if(checkprime==true)
			{
				System.out.print(i+" ");
				sum+=i;
			}
		}
		
		System.out.println("sum of prime number till "+n+"= "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		sumOFPrime(n);

	}

}
