package com.looplogic;
import java.util.Scanner;

public class SumRevNum {
	static boolean checkRevSum(int num)
	{ 
		int origin=num;
		int last3Sum=0;
		int first3Sum=0;
		for (int i=0;i<3;i++) 
		{
			last3Sum=last3Sum+(num%10);
			num/=10;
		}
		System.out.println("last 3 digit sum="+last3Sum);
		num=origin;
		int rev=0;
				while(num!=0)
				{
					rev=rev*10+(num%10);
					num/=10;
				}
				for (int i=0;i<3;i++) 
				{
					first3Sum=first3Sum+(num%10);
					rev=rev/10;
				}
				System.out.println(first3Sum);
			if(last3Sum==first3Sum)
			{
				return true;
			}
			else
			{
				return false;
	         }
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumRevNum s1=new SumRevNum();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		System.out.println("number is: "+num);
		System.out.println(checkRevSum(num));

	}

}
