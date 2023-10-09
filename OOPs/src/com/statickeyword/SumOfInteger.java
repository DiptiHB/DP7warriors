package com.statickeyword;

import java.util.Scanner;

//1
class Sum
{
	static int a;
	static int b;
	static int c;
	static int result;
	static
	{
		a=0;
		b=0;
		c=0;
		result=0;
	}
	static void add()
	{
		result=a+b+c;
		System.out.println("addintion of numbers: "+result);
	}
	
	
}

public class SumOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  value of a: ");
		Sum.a=sc.nextInt();
		System.out.println("enter  value of b: ");
		Sum.b=sc.nextInt();
		System.out.println("enter  value of c: ");
		Sum.c=sc.nextInt();
		Sum.add();

	}

}
