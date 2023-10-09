package com.abstactclass;
abstract class Card
{
	 static String ShopName="Creative Mind";
	 String cardType;//retro,modern;
	 int size;
	 Card()
	 {
		 
	 }
public Card(String cardType, int size)
{
	this.cardType = cardType;
	this.size = size;
}
 void show()
 {
	 System.out.println("*********"+ShopName+"*****************");
	 System.out.println("WELCOME TO CRAFT SHOP!!");
	 System.out.println("we have gifts ,cards and other crafting assets");
	 System.out.println("IF YOU WANT SUGGETIONS WE ARE HERE!");
 }
 abstract void showCard();
}
class BirthdayCard extends Card
{
	String name;
	String date;
	BirthdayCard()
	{
		super();
	}
	BirthdayCard(String cardType, int size,String name,String date)
	{
		super(cardType,size);
		this.name=name;
		this.date=date;
	}
	void showCard()
	{
		System.out.println("A very HAPPY BIRTHDAY from 'creative mind'");
		System.out.println("card type: "+cardType);
		System.out.println("card size in cm: "+size);
		System.out.println("name: "+name);
		System.out.println("date: "+date);
		
		System.out.println("message: wishing a very happy birthday !Stay happy and blessed!:)");
		System.out.println("i hope your upcoming year will fill by love and happiness.");
	}
}
class WeddingCard extends Card
{
int years;
int price;
WeddingCard()
{
	
}
public WeddingCard(String cardType, int size,int years,int price) {
	super(cardType,size);
	this.years = years;
	this.price=price;
}
void showCard()
{
	System.out.println("A very HAPPY ANNIVERSARY from 'creative mind'");
	System.out.println("card type: "+cardType);
	System.out.println("card size in cm: "+size);
	System.out.println("years completed: "+years);
	System.out.println("price : "+price);

	System.out.println("message: you both are ideal couple happy anniversary on your completing years "+years+ " :)");
	System.out.println("i hope you will be with each other till last breath");
}
}
public class CardOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1;
		
		c1=new BirthdayCard("retro",15,"Dipti","18/9");
		c1.show();
		c1.showCard();
		System.out.println("---------------------------------------------");
		c1=new WeddingCard("modern",20,25,500);
		c1.showCard();
	}

}
