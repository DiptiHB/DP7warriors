package com.constructor;
class test1
{
	int a;
	int b;
	String name;

test1()
{
	System.out.println("default constructor");
	this.a=5;
	this.b=6;
	this.name="unknown";
	System.out.println("task has to be done everytime");
}
test1(int a,int b)
{
	this();
	System.out.println("paramerized constuctor");
	this.a=a;
	this.b=b;
}
test1(int a,int b,String name)

{
this();
this.a=a;
this.b=b;
this.name=name;
}
public String toString()
{
return "\n a: "+a+"\n b: "+ b+"\n name: "+name;	
}

}


public class ConstructorChaining2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t1=new test1();
		System.out.println(t1);
	    System.out.println("*************************************************");
		test1 t2=new test1(20,30);
		System.out.println(t2);
		System.out.println("*************************************************");
		test1 t3=new test1(50,60,"Dipti");
		System.out.println(t3);
	}

}
