package com.looplogic;
import java.util.Scanner;
public class Armstrong2 {

	
		// TODO Auto-generated method stub
		static void armstrongno(int num)
		{   int count=0;
			int original=num;
			double sum=0;
			while(num>0)
			{
				
				int rem=num%10;
				count++;
				System.out.println(rem);
			
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
