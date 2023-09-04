package com.looplogic;
import java.util.Scanner;
public class ArmstrongNum {
	static void armstrong(int num)
	{
		int original=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num/=10;
		}
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
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: " );
		int num=sc.nextInt();
		armstrong(num);
	}

}
