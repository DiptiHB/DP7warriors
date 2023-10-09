package com.interfacedemo;
interface Backary
{
	public static final String bName="Delicious:)";// by default public static final
	public abstract void bake();
	
}
class Cake implements Backary
{
	public void bake()//by default public abstract
	{
		System.out.println("we bake cake: chocolate,pineaaple,truffle");
	}
}
class Biscuits implements Backary
{
	public void bake()
	{
		System.out.println("we bake biscuits: chocochips,creamy,almond");
	}
	public void minOrder()
	{
		System.out.println("minimum package is 259gm");
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Backary name: "+Backary.bName);
		Cake c1=new Cake();
		c1.bake();
		System.out.println("--------------------------------------------------");
		Biscuits  b1=new  Biscuits ();
		b1.bake();
		b1.minOrder();
		System.out.println("----------------------------------------------------");
		Backary b=new Biscuits ();
		b.bake();
		//b.minOrder();// gives error.
		
		 
		 
		
	}

}
