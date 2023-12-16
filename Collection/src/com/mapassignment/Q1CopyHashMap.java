package com.mapassignment;

import java.util.*;

//1.	WAP to copy all of the mappings from the specified HashMap to another map
public class Q1CopyHashMap {
	public static void copyMap(HashMap<Integer,String>map)
	{
		HashMap<Integer ,String>map2=new HashMap<>();
		map2.putAll(map);
		for(Map.Entry<Integer, String>e:map2.entrySet())
		{
			System.out.println(e.getKey()+"= "+e.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<>();
	    map.put(1, "Snow White");
	    map.put(2, "Peparina");
	    map.put(3, "Prince");
	    map.put(4, "Slipendrella");
	    map.put(5, "Clindrella");
	    copyMap(map);
	    
	    
		

	}

}
