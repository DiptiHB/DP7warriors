package com.looplogic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number till you want series: ");
	       int num=sc.nextInt();
	       System.out.println(" *****fibonancci series*****");
	       int f1,f2=0,sum=1;
	       for(int i=1;i<=num;i++)
	       {
	    	   System.out.print(" "+sum+" ");
	    	   f1=f2;
	    	   f2=sum;
	    	   sum=f1+f2;
	       }
	       
           sc.close();
	}

}
