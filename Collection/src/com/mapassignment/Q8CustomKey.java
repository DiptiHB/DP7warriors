package com.mapassignment;
//8.	WAP to create a map using Custom class as key and any other JDK provided object as value
import java.util.*;

public class Q8CustomKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Person,String>map=new HashMap<>();
		map.put(new Person(25,"Dipti"), "India");
		map.put(new Person(20,"George"), "America");
		map.put(new Person(22,"Devid"), "French");
		map.put(new Person(30,"Hayat"), "Turky");
		map.put(new Person(23,"Ram"), "India");
		
		for(Map.Entry<Person, String>e:map.entrySet())
		{
			System.out.println(e.getKey().getName()+"-->"+e.getValue());
			System.out.println("_______________________________________");
		}
		
		TreeMap<Person,String>tm=new TreeMap<>(new NameComparator());
		tm.putAll(map);
		for(Map.Entry<Person,String>e:tm.entrySet())
		{
			System.out.println(e.getKey().getName()+"-->"+e.getValue());
		}
		
	}

}
