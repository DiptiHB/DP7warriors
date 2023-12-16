package com.exception2;

public class checkedException2 {
	void method1() throws ClassNotFoundException
	{
		throw new ClassNotFoundException("class not found! :");
	}
	 void method2() throws ClassNotFoundException
	{
		method1();
	}
	void method3() 
	{
		try {
		method1();
		}catch(Exception e)
		{
			System.out.println("in method 3: "+e);
		}
	}

	public static void main(String[] args) throws ClassNotFoundException  {
		// TODO Auto-generated method stub
		checkedException2 obj2=new checkedException2();
		obj2.method3();

	}

}
