package com.polymorphism;

	class Shape1
	{
		static void area(int side)
		{
			int result=side*side;
			System.out.println("area of square: "+result);
			
		}
		static void area(int l,int b)
		{
			System.out.println("area of rectangle is: "+(l*b));
		}
		static void area (float r)
		{
			float f=3.14f;
			System.out.println("area of circle "+(f*r*r));
		}
		
	}
		
		
	public class PolyDemoStatic {
		
	

	}
