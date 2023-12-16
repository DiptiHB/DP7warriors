package com.theoryassignment;
class KeySuper
{
	int a=10;
	int side;
	KeySuper()
	{
		
	}
	KeySuper(int side)
	{
		this.side=side;
	}
	public void setSide(int side)
	{
		this.side=side;
	}
	public int getSide()
    {
		return side;
	}
	void display()
	{
		System.out.println("use of super keyword.");
	}
}
class Square extends KeySuper
{
	int a=20;
	int result;
	Square()
	{
	super();	
	}
	Square(int side)
	{
		super(side);
	}
	void calArea()
	{
	result=side*side;
	System.out.println("area of square: "+result);
	}
	void display()
	{
		System.out.println("value of a in parent class: "+super.a);
		System.out.println("value of a in child class: "+a);
	}
	
}
class rectangle extends KeySuper
{
	int br;
	rectangle()
	{
		super();
	}
	rectangle(int side,int br)
	{
		super(side);
		this.br=br;
	}
	void calArea()
	{
	int result=side*br;
	System.out.println("area of rectangle: "+result);
	}
}
public class SuperKeyworduse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1=new Square(5);
		s1.calArea();
		s1.display();
		rectangle r1= new rectangle(6,6);
		r1.calArea();

	}

}
