package com.looplogic;

import java.util.Scanner;

public class PellNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number till you want series: ");
	       int num=sc.nextInt();
	       System.out.println(" *****pell series*****");
	       int a,b=0,sum=1;
	       for(int i=1;i<=num;i++)
	       {
	    	   System.out.println(""+sum+"");
	    	   a=b;
	    	   b=sum;
	    	   sum=sum*2+a;
	       }
      sc.close();
	}

}
