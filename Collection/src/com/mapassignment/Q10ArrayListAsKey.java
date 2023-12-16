package com.mapassignment;

import java.util.*;

//10.	WAP to create a map which stores an arraylist as a value
public class Q10ArrayListAsKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al=new ArrayList<>();
		al.add("Dipti");
		ArrayList<String>al2=new ArrayList<>();
		al2.add("Ram");
		ArrayList<String>al3=new ArrayList<>();
		al3.add("Sita");
		ArrayList<String>al4=new ArrayList<>();
		al4.add("vishnu");
		
		HashMap<ArrayList<String>,Integer>hm=new HashMap<>();
		
		hm.put(al, 89);
		hm.put(al3, 90);
		hm.put(al4, 69);
		hm.put(al2, 75);
		
		for(Map.Entry<ArrayList<String>,Integer>e:hm.entrySet())
		{
			System.out.println(e.getKey().get(0)+"-->"+e.getValue());
		}
		
		

	}

}
