package com.varargs;

public class overloading {
	static void display(int ...n)
	{
		for(int i:n)
		{
			System.out.println(i);
		}
	}
	static void display(float ...f)
	{
		for(float i:f)
		{ 
			System.out.println(i);
		}
	}
	static void display(String...s)
	{
		for(String i:s)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display(1,2,3);
		display(1.1f,2.2f,3.3f);
		display("dipti","Pratisha","Sharvari");

	}

}
// we can not override methods with varargs as a agrument because o of args are notfixed in this.
