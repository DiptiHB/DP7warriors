package com.polymorphism;

class Calci
{
	void cal(int s)
	{
		System.out.println("square of number:"+(s*s));
		
	}
	void cal(int l,int b)
	{
		System.out.println("addition of two number: "+(l+b));
	}
	void cal(float c,float d)
	{
		System.out.println("multiplication of numbers: "+(c*d));
	}
	
	
}

public class PolyCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci c=new Calci();
		c.cal(2);
		c.cal(4,5);
		c.cal(2.5f,2.5f);
		
	}

}
