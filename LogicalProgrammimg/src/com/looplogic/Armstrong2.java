package com.looplogic;
import java.util.Scanner;
public class Armstrong2 {

	
		// TODO Auto-generated method stub
		static void armstrongno(int num)
		{   int count=0;
			int original=num;
			int rem=0;
			double sum=0;
			for (int n=num;num!=0;num/=10)
			{
				count++;
			}
			System.out.println(count);//3
			 for(int i=0;i<=count;i++)
			{
			     rem=num%10;
				sum=sum+(Math.pow(rem,count));
				num/=10;
				
			}
		
			System.out.println(count);
			System.out.println("sum="+sum);
			if(original==sum)
			{
				System.out.println(original+" is Armstrong number");
			}
			else
			{
				System.out.println(original+" is not armstrong number");
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number: " );
			int num=sc.nextInt();
			armstrongno(num);
			
			

	}

}
