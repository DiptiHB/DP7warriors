package com.looplogic;

import java.util.Scanner;

public class BouncyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number : ");
	       int num=sc.nextInt();
	       int increase=0,decrease=0,digit,digit2;
           int origin=num;
           if(num<=100)
           {
        	   System.out.println("there is no bouncy number between 1 to 100 "+ origin);
           }
           else
           {
        	   while(num!=0)
        	   {
        		   digit=num%10;
        		   digit2=(num%100)/10;
        		   num/=10;
        		   if(digit>digit2 && decrease==0)
        		   {
        			   increase=1;
        			  
        			   continue;
        			   
        		   }
        		  
        		   
        		   else if(digit<digit2 && increase==0 )
        		   {
        			   decrease=1;
        			   
        			   continue;
        		   }
        		   else
        		   {
        			   decrease=2;
        			   break;
        		   }
        	   }
        	   
           }
           if (decrease==2)
           {
        	   System.out.println("number is bouncy number "+origin);
           }
           else
           {
        	   System.out.println("number is not bouncy number "+origin);
           }
           sc.close();
	}

}
