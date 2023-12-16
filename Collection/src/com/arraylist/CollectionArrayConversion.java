package com.arraylist;

import java.util.*;

public class CollectionArrayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convert array to collection
		// 1st way 
		
		String color[]= {"Red","Blue","White","Yellow","Purple"};
		List<String> al=Arrays.asList(color);//return type of method is List<String>
		System.out.println(al);
		System.out.println("----------------------------------------");
		// 2nd way to store in arrayList
		
		ArrayList<String> al2 = new ArrayList(Arrays.asList(color));
		System.out.println(al2);
		System.out.println("---------------------------------");
		//3rd way if we already have arrayList
		
		ArrayList<String> al3= new ArrayList<>();
		Collections.addAll(al3, color);//parameters (collection and element)
		System.out.println(al3);
		
		System.out.println("*******************************************************");
		//convert arrayList to array
		//1st way// not type safe
		
		Object[] col=al2.toArray();//return type is Object[]
		System.out.println(Arrays.toString(col));
		
		for(int i=0;i<col.length;i++)
		{
			col[i]=((String) col[i]).concat("color");//need to do casting
		}
		System.out.println(Arrays.toString(col));
		
		System.out.println("----------------------------------------------------");
		//2nd way: type safe
		
		String cols[]=new String[al2.size()];
		al2.toArray(cols);
		
		for(int i=0;i<cols.length;i++)
		{
			cols[i]= cols[i].concat("color");
		}
		System.out.println(Arrays.toString(cols));
		
	}

}
