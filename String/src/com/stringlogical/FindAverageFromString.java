package com.stringlogical;

import java.util.Scanner;

public class FindAverageFromString {
	static void findAverage(String s)
	{
		char ch[]=s.toCharArray();
		int sum=0;
		int count=0;
		int average=0;
		for(int i=0;i<ch.length;i++)
		{
				if(ch[i]>=48 && ch[i]<=57)
				{
					sum+=ch[i]-48;//to get value
					count++;
				}
		}
		System.out.println("sum: "+sum);
		average=sum/count;
		System.out.println("average of number :"+average);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter string that contains alphabet and digits");
		String s=sc.next();
		findAverage(s);

	}

}
