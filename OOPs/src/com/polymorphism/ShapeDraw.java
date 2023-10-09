package com.polymorphism;
class DrawShapes
{
	double result;
	void draw(int a)
	{
	result=a*a;
	System.out.println("square: "+result);
	}
	void draw(int l,int b)
	{
		result=l*b;
		System.out.println("rctangle: "+result);
	}
	void draw(float r)
	{
		float f=3.14f;
		result=f*r*r;
		System.out.println("circle: "+result);
	}
	
}

public class ShapeDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawShapes d1=new DrawShapes();
		d1.draw(5);
		d1.draw(6, 6);
		d1.draw(2.5f);
		

	}

}
