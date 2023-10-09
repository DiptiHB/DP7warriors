package com.inheritance;
class Fruit
{
	String name;
	String seasonal;
	String taste;
	int seeds;
	Fruit()
	{
		
	}
	public Fruit(String name, String seasonal, String taste, int seeds) 
	{
		this.name = name;
		this.seasonal = seasonal;
		this.taste = taste;
		this.seeds = seeds;
	}
	void display()
	{
		System.out.println("fruit name: "+name);
		System.out.println("seasonal: "+seasonal);
		System.out.println("taste: "+taste);
		System.out.println("no of seeds: "+seeds);
	}
	
	
}
class Mango extends Fruit
{ String desc;
    Mango()
    {
	   
	}
    Mango(String name, String seasonal, String taste, int seeds,String desc)
    { 
    	super(name,seasonal,taste,seeds);
    	this.desc=desc;
    	
    }
	
}
class Orange extends Fruit
{
	String discription;
	Orange()
	{
		
	}
	Orange(String name, String seasonal, String taste, int seeds,String discription )
	{
		super(name,seasonal,taste,seeds);
		this.discription=discription;
	}
	
}
public class FruitDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango m1=new Mango("mango","yes","sweet",1,"taste very good");
		Orange o1=new Orange("orange","no","sour",12,"sweet & sour");
		m1.display();
		System.out.println("--------------------------------------------------------------");
		o1.display();

	}

}
