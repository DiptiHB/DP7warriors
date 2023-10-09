package com.inheritance;
 class Vehical
 {
	 int milege;
	 String name;
	 Vehical()
	 {
		 
	 }
	 Vehical(int milege,String name)
	 {
		 this.milege=milege;
		 this.name=name;
		 
	 }
	 public void setMilege(int milege)
	 {
		 this.milege=milege;
	 }
	 public int getMilege()
	 {
		 return milege;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public String toString()
	 {
		 return "\n milege: "+milege+"\n name: "+name;
	 } 
	 
 }
 class Car extends Vehical
 {
	 String color;
	 String brand;
	 
	 Car()
	 {
		 super();
	 }
	 Car(int milege,String name,String color,String brand)
	 {
		 super(milege,name);
		this.color=color;
		this.brand=brand; 
	 }
	 public void setColor(String color)
	 {
		 this.color=color;
		 
	 }
	 public String getColor()
	 {
		 return color;
		 
	 }
	 public void setBrand(String brand)
	 {
		 this.brand=brand;
		 
	 }
	 public String getBrand()
	 {
		 return brand;
		 
	 }
	 public String toString()
	 {
		 return super.toString()+"\n color:  "+color+"\n Brand name: "+brand;
	 }
	 
 }
 class RacingCar extends Car
 
 {
	 int maxSpeed;
	 int model;
	 
	 RacingCar()
	 {
		super(); 
	 }
	 RacingCar(int milege,String name,String color,String brand,int maxSpeed,int model)
	 {
		 super(milege,name,color,brand);
		 this.maxSpeed=maxSpeed;
		 this.model=model;
	 }
	 public void setMaxSpeed(int maxSpeed)
	 {
		 this.maxSpeed=maxSpeed; 
	 }
	 public int getMaxSpeed()
	 {
		 return maxSpeed; 
	 }
	 public void setModel(int model)
	 {
		 this.model=model; 
	 }
	 public int getModel()
	 {
		 return model; 
	 }
	 public String toString()
	 {
		 return super.toString()+"\n speed: "+maxSpeed+"\n model: "+model;
	 }
	 
 }



public class DetailsofVehical {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car c=new Car(85,"dodge","Blue","Jeep");
     System.out.println(c);
     
     RacingCar rc=new RacingCar(100,"formula1","red","ferrari",400,2022);
     System.out.println(rc);
	}

}
