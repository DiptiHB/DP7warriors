package com.classobjects;

public class Car {

	
		// TODO Auto-generated method stub
		int carId;
		String brand;
		float price;
		String carName;
		void display()
		{
			System.out.println("car id ="+carId+ ":" +carName);
			System.out.println("brand:"+brand);
			System.out.println("price:"+price);
		}
		public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		c1.carId=1010;
		c1.brand="ferrari";
		c1.price=890000;
		c1.carName="ferrari roma";
		c1.display();
		
		c2.carId=1111;
		c2.brand="bentley";
		c2.price=9900000;
		c2.carName="bentley bentayga";
		c2.display();
		

	}

}
