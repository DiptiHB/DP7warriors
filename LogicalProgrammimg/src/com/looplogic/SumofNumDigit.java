package com.looplogic;
import java.util.Scanner;
public class SumofNumDigit {
	static int reduceNum(int num)
	{
		int rem=0;
		int sum=0;
		while(num!=0 || sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			
			rem=num%10;
			sum=sum+rem;
			num/=10;
				
		}
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		int ans=reduceNum(num);
		System.out.println(num+" is reduced to single digit "+ans);
		

	}

}
