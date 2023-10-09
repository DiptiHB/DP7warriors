package com.interfacedemo;
interface Movable
{
	void move();
}

interface printable extends Movable
{
void printable(String name);	
}
class Car implements printable
{
	public void move()
	{
		System.out.println("Car is moving with speed :100km/hr" );
	}
		

	public void printable(String name) {
		
		{
			System.out.println("my car name is: "+name);
		}
		
	}
	
}
public class ExtendsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.move();
		c1.printable("Toyota");

	}

}
