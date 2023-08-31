package com.loop;

import java.util.Scanner;

public class PrimeNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		boolean flag=false;// can
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
			
		}
      if(flag==false)
      {
    	  System.out.println("number is prime");
    	  
      }
      else
      {
    	  System.out.println("number is not prime");
      }
      sc.close();
	}

}
