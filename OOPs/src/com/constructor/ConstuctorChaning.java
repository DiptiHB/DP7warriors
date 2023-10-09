package com.constructor;


class Demo1
{
	int a;
	int b;
	String name;

public Demo1()
{
	this(10,20);
	System.out.println("default constructor");
}
public Demo1(int a,int b)
{
	System.out.println("paramerized constuctor");
	this.a=a;
	this.b=b;
	this.name="unknown";
}
public String toString()
{
return " a: "+a+" b: "+ b+" name: "+name;	
}
}	
	
public class ConstuctorChaning {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		System.out.println(d1);
		
		Demo1 d2=new Demo1(30,40);
		System.out.println(d2);
		

	}

}
