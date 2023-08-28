package com.ifelse;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    if(n%2==0)
    {
    	
    	System.out.println("number is even");
    	
    }
    else
    {
    	System.out.println("number is odd");
    
    }
    
    sc.close();
	}

}

