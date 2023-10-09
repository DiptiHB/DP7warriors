package com.constructor;
class MyClass
{
int a;
int b;

MyClass()
{
   this(10,20);	
}
MyClass(int a,int b)
{
this.a=a;
this.b=b;
}
void display()
{
int a;
a=99;
System.out.println("local: "+a);//99: local variable
System.out.println("instance: "+this.a);
this.addition(this);
}
void addition(MyClass c)
{
this.a=this.a+c.a;
this.b=this.b+c.b;
}
MyClass displayValue()
{
a=a+10;
b=b+10;
return this;
}
}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass c1=new MyClass();
		//System.out.println(c1);
		MyClass c2=new MyClass(30,40);
		c1.addition(c2);
		//c2.display();
		System.out.println("before c1");
		System.out.println(c1.a+"  "+c1.b);
		System.out.println("------------------------------------------------");
		System.out.println("after c1");
		System.out.println(c1.a+" "+c1.b);
		
		
		//MyClass c3=new MyClass(100,200);
		System.out.println(c2.a+"  "+c2.b);
		System.out.println("------------------------------------------------");
		System.out.println("after c2");
		System.out.println(c2.a+"  "+c2.b);
		
		MyClass c3=new MyClass(100,200);
		System.out.println(c3.a+"  "+c3.b);
		System.out.println("------------------------------------------------");
		System.out.println("after c3");
		System.out.println(c3.a+"  "+c3.b);
		
		MyClass c4=new MyClass(4,6);
		System.out.println(c4.a+"  "+c4.b);
		System.out.println("------------------------------------------------");
		System.out.println("after c4");
		System.out.println(c4.a+"  "+c4.b);
		c4.displayValue();

	}

}
