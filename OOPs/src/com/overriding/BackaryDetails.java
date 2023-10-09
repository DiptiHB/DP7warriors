package com.overriding;
class Beckary
{
	static int count;
	static
	{
		count=0;
	}
	{
		count++;
	}
	void bake()	
	{
	System.out.println("WELCOME TO BECKARY!!");	
	}
	void types()
	{
	System.out.println("we have bread,butter,cakes,cream rolls and so on..!you will get everythig here at one place:)");	
	}
	}
class BreadBaker extends Beckary
{
	void bake()
	{
		System.out.println("HELLO! we bake bread.");
		
	}
	void types()
	{
		System.out.println("you will get all types of bread.");
		System.out.println("thank you for visiting!!");
	}
	
}
class CakeBaker extends Beckary
{
	void bake()
	{
		System.out.println("HELLO! we bake cake.");
		
	}
	void types()
	{
		System.out.println("you will get all flavours of cake like chocolate,rose,vanilla.");
		System.out.println("thank you for visiting!!");
	}
	
}
class BuiscuitBaker extends Beckary
{
	void bake()
	{
		System.out.println("HELLO! we bake Buiscuits.");
		
	}
	void types()
	{
		System.out.println("we have all types of buiscuits rolles buiscuits,drop buiscuits scones..");
		System.out.println("thank you for visiting!!");
	}
	
}

public class BackaryDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beckary b;
		b=new Beckary();
		b.bake();
		b.types();
		System.out.println("the number of object created of class Beckary are: "+Beckary.count);
		System.out.println("------------------------------------------------------");
		b= new BreadBaker();
		b.bake();
		b.types();
		System.out.println("--------------------------------------------------------");
		b=new CakeBaker();
		b.bake();
		b.types();
		System.out.println("-----------------------------------------------------------");
		b=new BuiscuitBaker();
		b.bake();
		b.types();
	}

}
