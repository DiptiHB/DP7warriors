package com.wrapper;

public class Wrapper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=203;
		int b=30;
		Integer i=Integer.valueOf(a);
		Integer k=Integer.valueOf(b);
		System.out.println("value of i: "+i);
		System.out.println("value of k: "+k);
		System.out.println("maximum number "+Integer.max(a, b));
		System.out.println("reverse number: "+Integer.reverse(a));//give  the order of the bits in thetwo's complement 
		                                                         //binary representation 
		
		char ch='A';
		Integer j=Integer.valueOf(ch);
		Character z=Character.toLowerCase(ch);
		System.out.println("lower case: "+z);
		System.out.println("Upper case: "+Character.toUpperCase('r'));
		System.out.println("is digit or not: "+Character.isDigit(ch));//Determines if the specified 
		                                           //character is a digit. 
		
		System.out.println("value of'A': "+j);
		
		
		String s="123";
		int x=Integer.parseInt(s);
		System.out.println("value: "+x);
		
		
	}

}
// advantage of wrapper class,collection,serilization,methos are in wrapper class,(valueOf,parseInt)
//