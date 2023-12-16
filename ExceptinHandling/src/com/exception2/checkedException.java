package com.exception2;

public class checkedException {
	void method1() throws ClassNotFoundException
	{
		throw new ClassNotFoundException("class not found! :");
	}
	 void method2() throws ClassNotFoundException
	{
		method1();
	}
	void method3() throws ClassNotFoundException
	{
		method1();
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		checkedException obj1=new checkedException();
		obj1.method3();

	}

}
