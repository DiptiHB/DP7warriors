package com.innerdemo;
class Outer
{
	private static int data=10;
	void display()
	{
		class inner
		{
			private int value=15;
			static void show()
			{
				System.out.println(data);
			}
			void show1()
			{
				System.out.println(value);
			}
		}
		inner i1=new inner();
		i1.show1();
		inner.show();
	}
	
}
public class LocalInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o1=new Outer();
		o1.display();
	}

}
