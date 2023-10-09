package com.polymorphism;

class Draw
{
	int area(int side)
{
	int result=side*side;
	return result;
	
}
int area(int l,int b)
{
	return(l*b);
}
float area (float r)
{
	float f=3.14f;
	return (f*r*r);
}
	
}

public class PolyDemoReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Draw square=new Draw();
		System.out.println("area of square: "+square.area(5));
		
		Draw rect=new Draw();
		System.out.println("area of rectangle: "+rect.area(5,8));
		
		Draw circle=new Draw();
		System.out.println("area of circle: "+circle.area(2.5f));

	}

}
