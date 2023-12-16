package com.hashmap;

import java.util.*;
import java.util.Map.Entry;

public class IteratingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double>hm=new HashMap<>();
		hm.put("Dipti", 80.0);
		hm.put("abhi", 95.0);
		hm.put("trisha", 78.5);
		hm.put("priya", 54.0);
		hm.put("kajal", 98.0);
		hm.put("arya", 82.8);
		System.out.println(hm);
		System.out.println("-------------2nd way--------------");
		Set<String>keys=hm.keySet();
		for(String s:keys)
		{
			System.out.println(s+"-->"+hm.get(s));
		}
		System.out.println("-------------3rd way--------------");
		Iterator<String>itr=keys.iterator();
		while(itr.hasNext())
		{
			String k=itr.next();
			System.out.println(k+"-->"+hm.get(k));
		}
		System.out.println("-------------4th way--------------");
		Collection<Double>marks=hm.values();
		for(Double m:marks)
		{
			System.out.println(m);
		}
		System.out.println("-------------5th way--------------");
		Set<Entry<String,Double>> entries=hm.entrySet();
		for(Entry<String,Double> e:entries)
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		System.out.println("-------------6th way--------------");
		for(Map.Entry<String,Double> e:hm.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}

	}

}
