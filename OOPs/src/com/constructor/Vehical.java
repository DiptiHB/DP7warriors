package com.constructor;

class Vehicals {
int id;
String name;
int price;

Vehicals()
{
this (0,"null",0);

}
Vehicals(int id,String name,int price)
{
this.id=id;
this.name=name;
this.price=price;
//System.out.println(this);
}

//public String toString()
//{
//return "\n id: "+id+"\n name: "+name+"\n price: "+price;	
//}
void show()
{
	System.out.println("id: "+this.id);
	System.out.println("name: "+this.name);
	System.out.println("price: "+this.price);
	display();
}
void display()
{
	System.out.println("use of this keyword");
}
	
}	

public class Vehical{
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicals v1=new Vehicals(111,"ford",900000);
		//System.out.println(v1);
		Vehicals v2=new Vehicals(112,"toyota",500000);
        //System.out.println(v2);
        
        v1.show();
        System.out.println("-----------------------------------------");
        v2.show();
	}

}
