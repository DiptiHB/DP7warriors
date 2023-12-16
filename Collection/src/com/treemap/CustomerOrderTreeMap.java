package com.treemap;
import java.util.*;
public class CustomerOrderTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Customer,Order> tmap=new TreeMap<>(new MboNoComparator());
		tmap.put(new Customer(111,"Dipti",(long) 914545214),new Order(1,"mobile",45000));
		tmap.put(new Customer(112,"Dipti",(long) 94545214),new Order(2,"charger",500));
		tmap.put(new Customer(113,"Shivani",(long) 9224587),new Order(3,"laptop",65000));
		tmap.put(new Customer(114,"Sharvari",(long) 9788498),new Order(1,"Headphones",12000));
		tmap.put(new Customer(115,"Spriya",(long) 98546212),new Order(1,"SSD",4500));
		
		for(Map.Entry<Customer, Order>e:tmap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getKey()); 
			System.out.println("------------------------------------");
		}
	}

}
