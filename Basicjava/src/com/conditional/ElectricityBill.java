package com.conditional;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of units");
		int units=sc.nextInt();
		double total;
		if (units<=50)
		{
			total=units*0.5;
			System.out.println("your total bill ammount is: "+total);
		}
		else if(units<150)
		{
			total=50*0.5+(units-50)*0.75;
			System.out.println("your total bill ammount is: "+total);
	    }
		else if(units<=250)
		{
			total=50*0.5+100*0.75+(units-150)*1.20;
			System.out.println("your total bill is: "+total);
		}
		else
		{
			total=50*0.5+100*0.75+100*1.20+(units-250)*1.5;
			System.out.println("your total bill is: "+total);
		}
		total=total+total*0.2;
		System.out.println("your final bill is: "+total);
		
		sc.close();
	}

}
