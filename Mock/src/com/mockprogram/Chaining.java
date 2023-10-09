package com.mockprogram;
class constuct
{
	
	int height;
	int side;
	
	constuct()
	{
      System.out.println("Welcome");
	}
	constuct(int side)
	{ 
		this();
		int result=side*side;
		System.out.println("area of square: "+result);
	}
	constuct(int height ,int base)
	{
		this(5);
		int ans=base*height;
		System.out.println("area of rectangle: "+ans);
	}
	
}
public class Chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constuct c1=new constuct(6,8);
		

	}

}
