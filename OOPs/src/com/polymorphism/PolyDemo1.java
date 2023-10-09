package com.polymorphism;

class Shape
{
	void area(int side)
	{
		int result=side*side;
		System.out.println("area of square: "+result);
		
	}
	void area(int l,int b)
	{
		System.out.println("area of rectangle is: "+(l*b));
	}
	void area (float r)
	{
		float f=3.14f;
		System.out.println("area of circle "+(f*r*r));
	}
}

public class PolyDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape square=new Shape();
		square.area(5);
		
		Shape rect=new Shape();
		rect.area(5,8);
		
		Shape circle=new Shape();
		circle.area(2.5f);
		
	}

}
