package com.looplogic;
import java.util.Scanner;
public class TwinPrime {
	int diffe=0;
	int num1;
	int num2;
	static void checkPrime(int num1)
	{
       boolean flag=false;
		
		for(int i=2;i<num1;i++)
		{
			if(num1%i==0)
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
	}
      
	static void checkPrime2(int num2)
	{
       boolean flag=false;
		
		for(int i=2;i<num2;i++)
		{
			if(num2%i==0)
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
	}
     
      static void checkTwin(int num1,int num2)
      {
      
      
      if((num2-num1)==2 || (num1-num2)==-2)
      {
    	  System.out.println("it is twin prime");
      }
      else
      {
    	  System.out.println("it is not twin prime");
      }
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1 : ");
		int num1=sc.nextInt();
		System.out.println("enter number 2 : ");
		int num2=sc.nextInt();
		
		checkPrime(num1);
		checkPrime2(num2);
		checkTwin(num1,num2);
	}

}
