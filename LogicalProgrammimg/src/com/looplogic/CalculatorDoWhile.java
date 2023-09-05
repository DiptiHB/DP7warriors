package com.looplogic;

import java.util.Scanner;

public class CalculatorDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double result;
		char ch;
		
		do 
		{
			System.out.println("Enter number 1: ");
			int num1=sc.nextInt();
			System.out.println("Enter number 2: ");
			int num2=sc.nextInt();
			System.out.println("Enter the operation you want to perform from 1:'+', 2:'-',3: '*', 4:'/', 5:'%' = ");
		    int op=sc.nextInt();
			switch(op)
			{
			case 1:
				result=num1+num2;
				System.out.println("addition of two numbers: "+result);
				break;
			case 2:
				result=num1-num2;
				System.out.println("substraction of two numbers: "+result);
				break;
			case 3:
				result=num1*num2;
				System.out.println("mulltiplication of two numbers: "+result);
				break;
			case 4:
				result=num1/num2;
				System.out.println("division of two numbers: "+result);
				break;
			case 5:
				result=num1%num2;
				System.out.println("modulus of two numbers: "+result);
				break;
			default:System.out.println("no operation choosen!");
			
		}
			System.out.println("do you want to continue press y for yes and press n for no");
			ch=sc.next().charAt(0);
			
					
	}while(ch!='n');
sc.close();
}
}
