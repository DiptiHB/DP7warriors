package com.ternery;

import java.util.Scanner;

public class BiggerNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1: ");
	    int num1=sc.nextInt();
	    System.out.println("enter number 2: ");
	    int num2=sc.nextInt();
	    int result=(num1>num2)?num1:num2;
	    System.out.println(result+" is greater");
		
		sc.close();	
	}

}
