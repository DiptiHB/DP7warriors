package com.interfaceadvance;
interface calculation
{
	float pi=3.147f;
	void area();
	default void volume()
	{
		System.out.println("volume calculator:");
		show();    //calling private instance methods in default method
	}
 static void info()
 {
	 System.out.println("geometry shapes");
	 display();// private static methods calling in static methods
 }
 private void show()
 {
	System.out.println("made by: Dipti"); 
 }
 private static void display()
 {
	System.out.println("pan no: BHF421B"); 
	 
 }
}
class square implements calculation
{
	int side;
	square()
	{
		
	}
	public square(int side) {
		super();
		this.side = side;
	}
	public void area()
	{
		System.out.println("area of square: "+(side*side));
		
	}
}
class cube implements calculation
{
	int side;
	cube()
	{
		
	}
	cube(int side)
	{
		this.side=side;
	}
	public void area()
	{
		System.out.println("area of cube: "+(6*side*side));
		
	}
	public void volume()
	{
		System.out.println("volume of cube: "+(side*side*side));
	}
	
}
public class DefaultMathodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation.info();
		calculation c;
		c=new square(5);
		c.area();
		
		c=new cube(7);
		c.area();
		c.volume();
		

	}

}
