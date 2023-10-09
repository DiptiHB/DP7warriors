package com.inheritance;
class Fish
{
	 String name;
	 int noOfGills;
	 String breed;
	Fish()
	{
		System.out.println("default constuctor");
	}
	public Fish(String name,int noOfGills,String breed) 
	{
		this.name=name;
		this.noOfGills=noOfGills;
		this.breed=breed;
	}
	
	public String toString() 
	{
		return "\n Fish name: " + name + "\n noOfGills: " + noOfGills + "\n breed: " + breed ;
	}
	
}
class GoldFish extends Fish
{
	String colorCombo;
	
	GoldFish()
	{
		//super();
	}
	GoldFish(String name,int noOfGills,String breed,String colorCombo)
	{
		super (name,noOfGills,breed);
		this.colorCombo=colorCombo;
	}
	public String toString() 
	{
		return super.toString()+"\n Gold Fish colorCombo: " + colorCombo;
	}
}
class Whale extends Fish
{
	String whaleSize;
	float whaleWeight;
	Whale()
	{
		super();
	}
	Whale(String name,int noOfGills,String breed,String whaleSize,float whaleWeight)
	{
		super(name,noOfGills,breed);
		this.whaleSize=whaleSize;
		this.whaleWeight=whaleWeight;
		
	}

	public String toString() 
	{
		return super.toString()+"\n Whale details: \n  whaleSize: " + whaleSize + "\n whaleWeight: " + whaleWeight;
	}
	
	
	
}

public class FishDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoldFish g1=new GoldFish("gold fish",6,"comet telled goldfish","yellow- black- red");
		System.out.println(g1);
		Whale w1=new Whale("whale",0,"orcinus orca","1.80 meters",500f);
		System.out.println(w1);
		GoldFish g2=new GoldFish();
		

	}

}
