package com.lab;

public class MethodOver {
	public void printParam(long l,double d)
	{
		System.out.println("long+double");
	}
	public void printParam(double i,long i1)
	{
		System.out.println("double+long");
	}
	public static void main(String args[])
	{
		MethodOver m1=new MethodOver();
		//m1.printParam(10,20);// method over loading ambiguity (type promotion ambiguity)
	}
	

}
