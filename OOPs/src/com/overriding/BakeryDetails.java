package com.overriding;
class MyBekery
{
private int bekeryId;
private String bname;
Cake c;
static int count;
static int ammount;
static
{
count=0;
ammount=0;
}
MyBekery()
{
	
}
public MyBekery(int bekeryId, String bname)
{
	
	this.bekeryId = bekeryId;
	this.bname = bname;

}

public void setBekeryId(int bekeryId) 
{
	this.bekeryId = bekeryId;
}
public int getBekeryId() 
{
	return bekeryId;
}

public void setBname(String bname) 
{
	this.bname = bname;
}
public String getBname()
{
	return bname;
}

public void setC(Cake c)
{
	this.c = c;
	count++;
	ammount=ammount+Cake.getPrice();
}
public Cake getC() 
{
	return c;
}

public static void setCount(int count) 
{
	MyBekery.count = count;
}
public static int getCount()
{
	return count;
}

public static void setAmmount(int ammount) 
{
	MyBekery.ammount = ammount;
}
public static int getAmmount()
{
	return ammount;
}

}


public class BakeryDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		MyBekery m1=new MyBekery(101,"german bakery");
		
		Cake c1=new Cake("vanilla",350);
		Cake c2=new Cake("chocolate",550);
		Cake c3=new Cake("pineapple",350);
		Cake c4=new Cake("fruit",400);
		
		System.out.println(" beckary Id: "+m1.getBekeryId()+" beckary name:  "+m1.getBname());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("number of cakes: "+m1.getCount());
		System.out.println("ammount: "+m1.getAmmount());
		
		m1.setC(c1);
		System.out.println(m1.getC());
		m1.setC(c3);
		System.out.println(m1.getC());
		m1.setC(c4);
		System.out.println(m1.getC());
		System.out.println("-----------------------------------------------------------------");
		System.out.println("number of cakes: "+m1.getCount());
		System.out.println("ammount: "+m1.getAmmount());
		
		
		
		
        
	}

}
