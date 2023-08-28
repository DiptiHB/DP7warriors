package com.ifelse;

import java.util.Scanner;

public class Admission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your percentage: ");
	    double per=sc.nextDouble();
	    System.out.println("enter your best 3 subject total: ");
	    int bestpre=sc.nextInt();
	    if((per>=90) || (bestpre>=85))
	    {
	    	System.out.println("You are eligible..! ");
	    }
	    else
	    {
	    	System.out.println("You are not eligible..! ");
	    }
	    sc.close();

	}

}
