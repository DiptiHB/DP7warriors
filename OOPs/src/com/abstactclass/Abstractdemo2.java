package com.abstactclass;
abstract class car
{
	String brandName;
	int price;
	car()
	{
		
	}
	car(String brandName,int price)
	{
	this.brandName=brandName;
	this.price=price;
	}
	@Override
	public String toString() {
		return "car [brandName=" + brandName + ", price=" + price + "]";
	}
	
}
class maruti extends car
{
	
}
public class Abstractdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
