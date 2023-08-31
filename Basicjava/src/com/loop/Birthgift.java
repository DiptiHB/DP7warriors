package com.loop;

import java.util.Scanner;

public class Birthgift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	    System.out.println("enter girl name:");
	    String name=sc.next();
	    System.out.println("how many year old:");
	    int years=sc.nextInt();
	    int result=0;
	    for(int i=1;i<=years;i++)
	    {
	    	result=years*years*years;
	    }
	    System.out.println("The number of gold coin "+ name+" got is:"+result);
	    
	    sc.close();

	}

}
