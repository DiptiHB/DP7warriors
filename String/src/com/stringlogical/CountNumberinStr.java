package com.stringlogical;

import java.util.Scanner;

public class CountNumberinStr {
	static void countNumber(String s)
	{
		boolean flag=false;
		int count=0;
		 char ch[]=s.toCharArray();//num[0-9]=ascii value from 49 to 57
		 for(int i=0;i<ch.length;i++)
		 {
			for(int j=49;j<=57;j++)
			{
				if(ch[i]==j)
				{
					flag=true;
					count++;
				}
			}
		 }
		 //System.out.println("count of numbers in given word are: "+count);
		 if(flag==true)
		 {
			 System.out.println("Numbers are present..!");
		 }
		 else
		 {
			 System.out.println("Numbers are not present!");
		 }
		 System.out.println("count of numbers in given word are: "+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word: ");
		String s=sc.next();
		countNumber(s);

	}

}
