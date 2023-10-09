package com.mockcode;
abstract class ShapeArea
{

	
	static float pi=3.147f;//we can have static variable in abstract class 
	ShapeArea()
	{
		
	}
    abstract void area();
}
class square extends ShapeArea
{
	int side;
	square()
	{
		
	}
	square(int side)
	{
	this.side=side;
	}

	void area()
	{
	System.out.println("area of suqare: "+(side*side));	
	}
}
class circle extends ShapeArea
{
	float radius;
	circle()
	{
	super();	
	}
	circle(float radius)
	{
		this.radius=radius;
	}
	void area()
	{
		System.out.println("area of circle: "+(pi*radius*radius));
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeArea s;
		s=new square(5);
		s.area();
		System.out.println("--------------------------------------------------");
		s=new circle(4);
		s.area();

	}

}
