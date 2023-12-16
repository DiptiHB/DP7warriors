package com.lab;

public class Simple {

	public static void method(int i) {
		System.out.println(i);

	}
	public static void method(double d)
	{
		System.out.println(d);
	}
	public static void main(String args[])
	{
		
		method('a');  //the method method(char) is undefined 
		method(2);
		method(2.0f);
	}
}
