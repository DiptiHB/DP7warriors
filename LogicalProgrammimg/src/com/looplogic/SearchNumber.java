package com.looplogic;
import java.util.Scanner;
public class SearchNumber {
	static void counter(int num,int luckyno)
	{
	int count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem==luckyno)
			{
				count++;
			}
			num/=10;
		}
		System.out.println("lucky number count is: "+count );
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name: ");
		String name=sc.next();
		System.out.println("enter lucky number: ");
		int luckyno=sc.nextInt();
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
	    counter(num,luckyno);
		sc.close();

	}

}
