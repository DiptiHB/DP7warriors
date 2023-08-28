package com.operators;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your height");
		double height=sc.nextDouble();
		System.out.println("enter your gender");
		char s=sc.next().charAt(0);
		System.out.println(" The name is : "+name);
		System.out.println("Age is: "+age);
		System.out.println("height is: "+height+" ft ");
		System.out.println("Gender is: "+s);
		
		sc.close();

	}

}
