package com.classobjects;

import java.util.Scanner;

public class CalSquareCube {
	static  int square(int num)
	{
	int result=num*num;
	return result;
	}
	static int cube(int num)
	{
		int result2=square(num)*num;
		return result2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		System.out.println("Square of number is: "+square(num));
		System.out.println("cube of given number is: "+cube(num));
        sc.close();
	}

}
