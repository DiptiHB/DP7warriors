package com.loop;

import java.util.Scanner;

public class FactorofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number: ");
		int num=sc.nextInt();
		int i=1;
        for( i=1;i<=num;i++)
        {
	      if(num%i==0)
	       {
	  	     System.out.println(+i+" is factor of "+num);
	       }
	   
        }
   
   sc.close();
	}

}
