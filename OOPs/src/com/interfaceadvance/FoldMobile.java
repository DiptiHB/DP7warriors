package com.interfaceadvance;
interface fold
{
	
void foldable();	
}
class Mobile
{
	String configutation;
	int price;
	Mobile()
	{
		
	}
	public Mobile(String configutation, int price) 
	{
		this.configutation = configutation;
		this.price = price;
	}
	void show()
	{
	System.out.println("Configutation: "+configutation);
	System.out.println("price: "+price);
	}
	
}
class samsung extends Mobile implements fold
{
String camQuality;
int Display;
String color;
	
	samsung()
	{
		
	}
	
	public samsung(String configutation, int price,String camQuality, int display,String color) 
	{
		super(configutation,price);
		this.camQuality = camQuality;
		Display = display;
		this.color=color;
	}

	public void foldable() {
		System.out.println("Samsung moblies added new featues 'FOLDABLE MOBILE'");
		
	}
	public String toString()
	{
	return "\nconfigutation: "+configutation+"\nprice: "+price+"\ncamera: "+camQuality+"\ndisplay: "+Display+" inch"+"\ncolor: "+color;	
		
	}
	
}
public class FoldMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fold f;
		Mobile m1=new Mobile("4GB RAM",55000);
		m1.show();
		f=new samsung("8GB RAM",75000,"35MP",12,"Black");
		System.out.println(f);
		f.foldable();
		
		
	}

}
