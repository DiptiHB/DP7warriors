package com.assignment;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary of employee: ");
		double salary=sc.nextDouble();
		double hra,da;
		if(salary<=10000)
		{
			hra=salary*0.2;
			da=salary*0.8;
			
		}
		else if(salary<=20000)
		{
			hra=salary*0.25;
			da=salary*0.9;
		}
		else
		{
			hra=salary*0.3;
			da=salary*0.95;
		}
		
		System.out.println("GROSS SALARY IS: "+(salary+hra+da));
  sc.close();
	}

}
