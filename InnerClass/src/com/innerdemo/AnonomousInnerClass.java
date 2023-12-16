package com.innerdemo;
interface Doable
{
		
	public void doit();
	
}
class car
{
	public void drive()
	{
		System.out.println("i am driving a car");
		
	}
}
abstract class cake
{
	public void bake()
	{
		System.out.println("i m baking a cake");
	}
	
}
public class AnonomousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using interface
		Doable d=new Doable()
				{
					public void doit()
					{
						System.out.println("I am doing my pending works");
					}
			
				};
				d.doit();
				//using concrete class
		car c1=new car()
			{
				public void drive()
					{
						System.out.println("i am driving sports car");
					}
					
			};
						
			c1.drive();
			// using abstract class
		cake ck1=new cake()
				{
					public void bake()
					{
						System.out.println("i am baking chocolate cake");
					}
			
				};
				ck1.bake();

	}

}
