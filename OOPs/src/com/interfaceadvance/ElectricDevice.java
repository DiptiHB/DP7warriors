package com.interfaceadvance;
interface Eletrical
{
public static final String brandName="samsung";	

public abstract void Access();

default void show()
{
	System.out.println("OUR SUGGETION!");
	System.out.println("Samsung Devices are trustable.Ensures your money worth");
	display();
	brand();
}
static void display()
{
	System.out.println("we have freezer,tv and other appliences");
}
private void brand()
{
System.out.println("Samsung head office is in seoul,south korea.");	
}
}
interface connection 
{
	int noofConnections=2;
	abstract void connect();
	
}
class TV implements Eletrical, connection
{
	String displaySize;
	int voltage;
	String type;
	TV()
	{
		
	}
	
	public TV(String displaySize, int voltage, String type) 
	{
		
		this.displaySize = displaySize;
		this.voltage = voltage;
		this.type = type;//OLED,LED,LCD,HD
	}

	public void Access()
	{
		System.out.println("you are buying Television .");
		System.out.println("display size: "+displaySize);
		System.out.println("voltage: "+voltage);
		System.out.println("type: "+type);
		System.out.println("you have great choice! Thank you!");
		
	}
	public void connect()
	{
		System.out.println("you can connect HDMI,pen Drive and USB cable");	
	}
}
class freezer implements Eletrical
{
  String capacity;
  int height;
  freezer()
  {
	  
  }
  
	public freezer(String capacity, int height)
	{
	
	this.capacity = capacity;
	this.height = height;
	}

	public void Access()
	{
		System.out.println("you are buying freezer .");
		System.out.println("capacity: "+capacity);
		System.out.println("height: "+height+"inch");
		System.out.println("you have great choice! Thank you!");
		
	}
}
public class ElectricDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Eletrical e1;
		e1=new TV("52'inch",15,"LED");
		e1.Access();
		connection c=new TV();
		c.connect();
		
		System.out.println("-----------------------------------------------");
		e1=new freezer ("16-20cu.ft",68);
		e1.Access();
		System.out.println("--------------------------------------------------");
		e1.show();
		//Eletrical.display();

	}

}
