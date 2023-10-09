package com.mockcode;
abstract class shape
{
	int side;
	static float pi=3.14f;
	shape()
	{
	
	}
	shape(int side)
	{
		this.side=side;	
	}
	
	abstract void area();
}
class rectangle extends shape
{
	int br;
	rectangle()
	{
		super();
	}
	rectangle(int side,int br)
	{
		super(side);
		this.br=br;
	}
	void area()
	{
		System.out.println("area of rectangle is: "+(side*br));
	}
	
}
class circle1 extends shape
{
	float rad;
	circle1()
	{
		super();
	}
	circle1(float rad)
	{
		
		
		this.rad=rad;
	}
	void area()
	{
		System.out.println("area of circle: "+(shape.pi*rad*rad));
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s;
		s=new rectangle(5,6);
		s.area();
		System.out.println("----------------------------------");
		s=new circle1(4);
		s.area();
		
	}

}
