package com.ternery;

import java.util.Scanner;

public class GreatestNumof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number 1:");
	    int num1=sc.nextInt();
	    System.out.println("enter number 2:");
	    int num2=sc.nextInt();
	    System.out.println("enter number 3:");
	    int num3=sc.nextInt();
	    int result=(num1>num2)?(num1>num3)?num1:num3:(num2>num3)?num2:num3;
	    System.out.println(result+" is greater.");
        sc.close();
	}

}
/*num1>num2 && num1>num3*/