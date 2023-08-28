package com.ifelse;
import java.util.Scanner;
public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1");
	    int a=sc.nextInt();
	    System.out.println("enter number 2");
	    int b=sc.nextInt();
	    if(a>b)
	    {
	    	System.out.println(a+" is greater than "+b);
	    	
	    }
	    else
	    {
	    	System.out.println(b+" is greater"+a);
	    }
	    
	   sc.close(); 
	}

}
