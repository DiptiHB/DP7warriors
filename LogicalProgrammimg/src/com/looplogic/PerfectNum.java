package com.looplogic;

import java.util.Scanner;

public class PerfectNum {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		int origin=num;
	 
	 int sum=0;
	 for(int i=1;i<num;i++)
	 {
		 if(num%i==0)
		 {
			 sum+=i;
		 }
	 }
	 if (sum==origin)
	 {
		 System.out.println(origin+" number is perfect number ");
		 
	 }
	 else
	 {
		 System.out.println(origin+" number is not perfect number ");
	 }
 
     sc.close();
	
		

	}

}
