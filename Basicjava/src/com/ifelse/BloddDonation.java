package com.ifelse;

import java.util.Scanner;

public class BloddDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your age: ");
	    int age=sc.nextInt();
	    
        System.out.println("enter you weight");
	   
	    if(age>=18)
	    {
	    	 double wei=sc.nextDouble();
	    	if(wei>=80)
	    	{
	    		
	    		System.out.println("you are eligible for blood donation..!");
	    	}
	    	else 
	    	{
	    		System.out.println(" sorry! you are under weight..");
	    	}
	    	
	    }
	    else
	    {
	    	System.out.println("you are under age..");
	    }
	    	
	    sc.close();

	}

}
