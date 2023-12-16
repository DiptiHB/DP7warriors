package com.lab;
class electronicDevice
{
	String name;
	String worranty;
	electronicDevice()
	{
		
	}
	electronicDevice(String name,String worranty)
	{
		this.name=name;
		this.worranty=worranty;
		
	}
	void electricDevice1()
	{
		System.out.println("\n name of electrical device: "+name+"\n waranty: "+worranty);
	}
}
class Mobile extends electronicDevice
{
	String mobileBrand;
	String config;
	
	 Mobile()
	 {
		 
	 }
	 Mobile(String name,String worranty,String mobileBrand,String config)
	 {
		 super(name,worranty);
		 this.mobileBrand=mobileBrand;
		 this.config=config;
	 }
	 void electricDevice()
	 {
		 System.out.println("\n mobile brand: "+mobileBrand+"\n configuration: "+config);
	 }
}
class Laptop extends electronicDevice
{
	String laptopBrand;
	String configuration;
	Laptop()
	{
		
	}
	Laptop(String name,String worranty,String laptopBrand,String configuration)
	{
		super(name,worranty);
		this.laptopBrand=laptopBrand;
		this.configuration=configuration;
		
	}
	 void electricDevice()
	 {
		 System.out.println("\n Laptop brand: "+laptopBrand+"\n configuration: "+configuration);
	 }
	
}

public class HirachiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1=new Mobile("Mobile","1 year","samsung","RAM:128GB, Cam:64mp");
        m1.electricDevice1();
        m1.electricDevice();
        Laptop l1=new Laptop("laptop","2 year","DELL","RAM: 16GB SSD: 8GB");
        l1.electricDevice1();
        l1.electricDevice();
	}

}
