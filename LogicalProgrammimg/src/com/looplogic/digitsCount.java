package com.looplogic;
import java.util.Scanner;

public class digitsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		
		for ( int i=0;i<=9;i++)
		{
			int temp=n;
			int count=0;
			while(temp!=0)
			{
				 int rem=temp%10;
				
				if(i==rem)
				{
					count++;
				}
				
				temp/=10;	
			}
			if (count>0)
			{
				System.out.println("number: "+i+ "-->"+count);
			}
			
				
		}
		

	}

}
