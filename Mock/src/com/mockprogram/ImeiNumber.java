package com.mockprogram;
import java.util.Scanner;
public class ImeiNumber {
	

	     static int count=0;
       
	     static int countDigit(long num)
		{
		
			while (num!=0)
			{
				num/=10;
			    count++;
			    
			}
		  return count;
		}
		static void checkIMEInum(long temp)
		{
				do 
				{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter 15 digit number: ");
				long num=sc.nextLong();
			    }while(count!=0);
			    int sum=0;
			    while(temp!=0)
			    {
			    	sum+=temp%10;
			    	temp/=10;
			    }
			    if(sum%10==0)
			    {
			    	System.out.println("sum of digits: "+sum);
			    }
			    else
			    {
			    	System.out.println("please enter 15 digits!");
			    }
		
	     }
			  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 15 digit number: ");
		long num=sc.nextLong();
		long temp=num;
		checkIMEInum(num);

	}

}
