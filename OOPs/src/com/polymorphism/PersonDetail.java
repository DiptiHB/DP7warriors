package com.polymorphism;

import java.util.Scanner;

class Humanalities
{
 int mSalary;
 int ySalary;
 String name;
 String role;
 String game;
 
 void activity(String name,String role)
 {
	System.out.println("person name is "+name); 
	System.out.println("role is "+role);
	System.out.println("YOU ARE REALLY DOING GREAT..!");
 }
 
 void activity(int mSalary)
 {
	 ySalary=mSalary*12;
	 System.out.println("yearly salary is "+ySalary+" FIGHTING.. YOU CAN DO BETTER!!");
	 
 }
   String activity(String game)
 {
	//System.out.println("Enjoys time by playing "+game+" wishing you agood health"); 
	 return game;
 }
	
}
public class PersonDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Humanalities h1=new Humanalities();
		System.out.println("enter name: " );
		h1.name=sc.next();
		System.out.println("enter your role in home: ");
		h1.role=sc.next();
		System.out.println("enter your monthly salary: ");
		h1.mSalary=sc.nextInt();
		System.out.println("enter which game do you like? ");
		h1.game=sc.next();
		
		h1.activity(h1.name,h1.role);
		h1.activity(h1.mSalary);
		String g=h1.activity(h1.game);
		System.out.println("Enjoys time by playing "+g+" wishing you a good health"); 
	}

}
