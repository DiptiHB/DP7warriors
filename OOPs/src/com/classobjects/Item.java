package com.classobjects;

import java.util.Scanner;

public class Item {

	int itemId;
	String itemName;
	int price;
	
	void display()
	{
		System.out.println("id: "+itemId );
		System.out.println("name: "+itemName);
		System.out.println("price: "+price);
		
	}
	
	public static void main(String[] args) {
		Item i=new Item();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter item ID : ");
		i. itemId=sc.nextInt();
		System.out.println("Enter item name: ");
        i. itemName=sc.next();
        System.out.println("enter price: ");
        i. price =sc.nextInt();
        i.display();
        sc.close();
	}

}
