package com.inheritance;

class Parent
{
	int x=10;
	int y=30;
	int z=100;
	void display()
	{
		System.out.println("parent method:"+(x+y));
		System.out.println(z);
	}
	
}
class Child extends Parent
{
   int x=20;
   void display()
   {
	   super.display();
	   System.out.println(x+40);
	   System.out.println(x+super.x);
	   System.out.println(x+y);
   }
}

public class ChildOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Child c1=new  Child();
		 c1.display();
		 
	}

}
