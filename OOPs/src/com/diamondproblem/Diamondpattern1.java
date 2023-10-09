package com.diamondproblem;
interface ElectricDevice
{
	default void print()
	{
		System.out.println("welcom to ElectricDevice interface");
	}
}

interface Laptop extends ElectricDevice
{
	default void print()
	{
		ElectricDevice.super.print();
		System.out.println("some people fount handling laptop hectic!");
	}
}
interface Mobile extends ElectricDevice
{
	default void print()
	{
		System.out.println("mobiles are handy and easy to use!");
		//ElectricDevice.super.print();
	}
}
class UseDaily implements Laptop,Mobile
{
	public void print()
	{
		Laptop.super.print();
		Mobile.super.print();
		System.out.println("We use laptop and mobile daily!");
		
	}
}

public class Diamondpattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UseDaily l1=new UseDaily();
		l1.print();
		
		
		
		

	}

}
