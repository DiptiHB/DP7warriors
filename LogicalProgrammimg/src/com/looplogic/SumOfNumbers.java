package com.looplogic;
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		int count=0;
		while(i!=0)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers: ");
		 int num=sc.nextInt();
		 count++;
		 if(num==0)
		 {
			 break;
		 }
		 sum=sum+num;
		
		
		//sc.close();
		}
      System.out.println("sum of numbers:"+sum);
     
	}

}
