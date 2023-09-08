package com.looplogic;

import java.util.Scanner;

public class InceaseDecreaseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number : ");
	       int num=sc.nextInt();
           int flag=0;
           while(num>0)
           {
        	   int increse=num%10;
        	   int temp=num;
        	   while(temp>0)
        	   {
        		   int rem=temp%10;
        		   if (rem>increse)
        		   {
        			 flag=1;
        			 break;
        		   }
        		   temp/=10;
        	   }
        	   num/=10;
           }
           if(flag==0)
           {
        	   System.out.println("number is incresing ");
           }
           else
           {
        	   System.out.println("number is decresing ");
           }
	}

}
