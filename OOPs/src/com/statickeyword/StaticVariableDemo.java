package com.statickeyword;

public class StaticVariableDemo {

	
	int x=10;
	static int y=20;
	
	void instanceMethod()
	{
		System.out.println("instance method");
		System.out.println(x);
		System.out.println(y);
		
	}
	static void staticMethod()
	{
		//System.out.println(x);  gives error because its instance variable
		System.out.println("-------------------------------------");
	    System.out.println(y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableDemo s1=new StaticVariableDemo();
		s1.instanceMethod();
		staticMethod(); // directly can call static methods
	}

}
