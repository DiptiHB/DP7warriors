package com.polymorphism;

public class TYpePromotion {
	
	static void display(float n)
	{
	System.out.println("in float");
	System.out.println(n);	
	}
	static void display(long n)
	{
	System.out.println("in long");
	System.out.println(n);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     display(5);
     display('A');
	}

}
