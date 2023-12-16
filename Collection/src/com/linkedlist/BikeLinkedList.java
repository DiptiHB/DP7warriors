package com.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BikeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Bike>bk=new LinkedList<>();
		bk.add(new Bike(1,"TVS Rider",97000,2021));
		bk.add(new Bike(2,"Bajaj Chetak",45000,2005));
		bk.add(new Bike(3,"hero honda",50000,2007));
		bk.add(new Bike(4,"Honda SP125",86000,2022));
		bk.addFirst(new Bike(5,"Royal Enfield Hunter",150000,2020));
		bk.addFirst(new Bike(6,"Hero Slpender",50000,2015));
		bk.addLast(new Bike(7,"Yamaha",900000,2008));
		System.out.println(bk);
		System.out.println("------------------------------------------------");
		
		Collections.sort(bk,new BikePriceComparator());
		for(Bike b:bk)
		{
			System.out.println(b);
		}
		System.out.println("------------------------------------------------");
		
		Collections.sort(bk,new BikeComparator2());
		for(Bike b:bk)
		{
			System.out.println(b);
		}
		System.out.println("-----------------------------------------------");
		
		Iterator<Bike>itr=bk.iterator();
		while(itr.hasNext())
		{
			
			Bike b=itr.next();
			if(b.getModelYear()<2010)
			{
				itr.remove();
			}
		
		}
		System.out.println(bk);

	}

}
