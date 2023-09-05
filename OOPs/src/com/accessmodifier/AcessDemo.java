package com.accessmodifier;

public class AcessDemo {
	private int a;
	int b;
	public int d;
	
	private void show()
	{
		System.out.println("HELLO");
	}
	void display()
	{
		System.out.println("WELCOME");
	}
	public void test()
	{
		System.out.println("congratulations");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessDemo ac=new AcessDemo();
		ac.a=90;
		ac.b=80;
		ac.d=50;
		ac.show();
		ac.display();   // default is accessible in package
		ac.test();
	}

}
