package com.statickeyword;

public class StaticDemo {
	int x=10;
	static int y=10;
	void show()
	{
		x++;
		System.out.println("x= "+x);
		y++;
		System.out.println("y= "+y);
	}
	void display()
	{
		int y=20;
		System.out.println(y);
		System.out.println(StaticDemo.y);
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo s1=new StaticDemo();
		System.out.println("object 1");
		s1.show();
		//s1.display();
		StaticDemo s2=new StaticDemo();
		System.out.println("object 2");
		s2.show();
		s2.display();
	}

}
