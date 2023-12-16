package com.treemap;
import java.util.*;
import java.util.Map.Entry;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tmap=new TreeMap<>();
		tmap.put(7, "japanese");
		tmap.put(2, "English");
		tmap.put(1, "Hindi");
		tmap.put(4, "Korean");
		tmap.put(9, "french");
		System.out.println(tmap);
		System.out.println("-------------------2nd way-------------------------");
		Set<Integer>keys=tmap.keySet();
		Iterator<Integer>itr=keys.iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.println(key+tmap.get(keys));
		}
		System.out.println("-------------------3rd way-------------------------");
		for(Map.Entry<Integer, String>e:tmap.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("-------------------4th way-------------------------");
		Set<Entry<Integer,String>>entries=tmap.entrySet();
		for(Entry<Integer,String>e:entries)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
