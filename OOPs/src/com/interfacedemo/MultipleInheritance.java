package com.interfacedemo;
interface showable
{
	void display();
	
}
interface printme
{
void display();	
}

class demo1 implements showable,printme
{
public void display()
{
System.out.println("WELCOME");	
}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 d1=new demo1();
		d1.display();
  
	}

}
