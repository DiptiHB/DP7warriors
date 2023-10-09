package com.statickeyword;
class Car
{
	String model;
	static int totalCarSold;
	static 
	{
		totalCarSold=0;	
	}
	static
	{
		System.out.println(totalCarSold);
	}
	{
		totalCarSold++;	
	}
	Car()
	{
		
	}
	Car(String model)
	{
		this.model=model;
	}
	
	public void setModel(String model) 
	{
		this.model=model;
	}
	public String getModel()
	{
		return model;
	}
	public String toString()
	
	{
		return "model: "+model;
		
	}
	
}

public class CarSold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Suzuki");
		Car c2=new Car("ford");
		Car c3=new Car("toyota");
		Car c4=new Car("nano");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		
		System.out.println("total no of object created: "+c1.totalCarSold);
		
		

	}

}
