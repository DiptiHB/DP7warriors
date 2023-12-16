package com.theoryassignment;
class Shape
{
	final int a=10;
	int side;
	final static int h;
	static 
	{
		h=5;
	}
	Shape()
	{
		
	}
	Shape(int side)
	{
		this.side=side;
	
	}
	void CalArea()
	{
		System.out.println("square: "+(side*side));
	}
	void triArea()
	{
		System.out.println("triangle: "+(a*side*h));
	}
	final void calRect()
	{
		System.out.println("rectangle: "+(a*side));
	}
	
}
//class Triangle extends Shape
//
//{
//	int base=side;
//	Triangle()
//	{
//		super();
//	}
//	Triangle(int a,int h,int base)
//	{
//		this.base=base;
//	}
//	
//	
//}
public class FinalDemoUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape s1=new Shape(5);
      s1.CalArea();
      s1.triArea();
      s1.calRect();
	}

}
