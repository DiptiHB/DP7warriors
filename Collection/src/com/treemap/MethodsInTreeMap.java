package com.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class MethodsInTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tmap=new TreeMap<>();
		tmap.put(7, "japanese");
		tmap.put(2, "English");
		tmap.put(1, "Hindi");
		tmap.put(4, "Korean");
		tmap.put(9, "french");
		
		System.out.println("First Key: "+tmap.firstKey());
		System.out.println("Last Key: "+tmap.lastKey());
		
		SortedMap<Integer,String>s1=tmap.subMap(1, 7);
		System.out.println(s1);
		
		SortedMap<Integer,String>s2=tmap.headMap(4);
		System.out.println(s2);
		
		SortedMap<Integer,String>s3=tmap.tailMap(4);
		System.out.println(s3);
		//navigable map
		System.out.println("Lower key: "+tmap.lowerKey(4));
	
		System.out.println("Floor key: "+tmap.floorKey(4));
		
		System.out.println("Higher key: "+tmap.higherKey(7));
		
		System.out.println("Ceiling key: "+tmap.ceilingKey(7));
		
		SortedMap<Integer,String>s4=tmap.subMap(1,false, 7,true);
		System.out.println(s4);
		
		SortedMap<Integer,String>s5=tmap.headMap(4,true);
		System.out.println(s5);
		

		SortedMap<Integer,String>s6=tmap.tailMap(4,false);
		System.out.println(s6);
		
		

	}

}
