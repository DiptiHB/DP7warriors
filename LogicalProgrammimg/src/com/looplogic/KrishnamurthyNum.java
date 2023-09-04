package com.looplogic;

import java.util.Scanner;

public class KrishnamurthyNum {

	static void krishna(int num)
	{   
		long sum=0;
		int original=num;
		long fact=1;
		
		while(num!=0)
		{
			int rem=num%10;
			fact=1;
					for(int i=1;i<=rem;i++)
					{
						fact*=i;
						
					}
			sum+=fact;
			num/=10;
		}
		if(original==sum)
		{
			System.out.println(original+" is krishnamurthy number");
			
		}
		else
		
			System.out.println(original+" is not krishmurthy number");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number: ");
		int num=sc.nextInt();
		krishna(num);
		sc.close();

	}

}
