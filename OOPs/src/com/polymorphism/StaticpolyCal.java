package com.polymorphism;
class StaticCalci
{
	static void cal(int s)
	{
		System.out.println("square of number:"+(s*s));
		
	}
	static void cal(int l,int b)
	{
		System.out.println("addition of two number: "+(l+b));
	}
	static void cal(float c,float d)
	{
		System.out.println("multiplication of numbers: "+(c*d));
	}
	
}
public class StaticpolyCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticCalci.cal(5);
		StaticCalci.cal(5,8);
		StaticCalci.cal(5.5f,5.5f);
		

	}

}
