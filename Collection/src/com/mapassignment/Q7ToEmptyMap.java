package com.mapassignment;
//7.	WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q7ToEmptyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<>();
	    map.put(1, "Snow White");
	    map.put(2, "Peparina");
	    map.put(3, "Prince");
	    map.put(4, "Slipendrella");
	    map.put(5, "Clindrella");
	    System.out.println(map);
	    System.out.println("----------------------------------");
	   Iterator <Integer>itr=map.keySet().iterator();
	   while(itr.hasNext())
	   {
		   int n=itr.next();
		   itr.remove();
	   }
	   System.out.println("after empting map: "+map.isEmpty());

	}

}
