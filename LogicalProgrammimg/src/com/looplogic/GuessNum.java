package com.looplogic;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	       System.out.println("the range is 1 to 50  ");
	       int guessnum=35;
	       int attempt=0; // for counting attempt
	       int num;
	       do
	       {
	    	   System.out.println("enter the number: ");
	    	   num=sc.nextInt();
	    	   attempt++;
	    	   if(num==guessnum)
	    	   {
	    		   System.out.println("WOW! congratulations!!! you have guessed correct number :)");
	    		   System.out.println("you have attempted "+attempt+" times");
	    		   break;
	    	   }
	    	   else if(num>guessnum)
	    	   {
	    		 System.out.println("nice try..!Please enter lower number.");  
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Please enter higher number.FIGHTING! :)");
	    	   }
	    	   
	       }while(num!=0);
	       sc.close();
	}
	

}
