package com.polymorphism;

public class TypePromoAmbi {
	
	static void add(int n,double n2)
	{
		System.out.println("in method 1");
		System.out.println(n+n2);
		
	}
	static void add(long n,float n2)
	{
		System.out.println("in method 1");
		System.out.println(n+n2);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //add(9,7.5f);// give error because ambiguity
		
		//9: int: asking 7.5 to cionvert into double
		// 7.5 is asking 9 to convert into long
	}

}
