package com.hashmap;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double>hm=new HashMap<>();
		hm.put("Dipti", 80.0);
		hm.put(null, 0.0);
		System.out.println(hm.put(null, 88.0));//replace value 0.0 
		hm.put("Ram", 70.0);
		System.out.println(hm);
		
		hm.put("sharu", 90.0);
		hm.put("abhi", 88.0);
		hm.put("kai", 75.0);
		System.out.println(hm);
		
		System.out.println("size: "+hm.size());
     // get
		System.out.println("marks of vishal: "+hm.get("abhi"));
		//check key is present or not
		System.out.println("suraj: "+hm.containsKey("suraj"));
		System.out.println("sharu: "+hm.containsKey("sharu"));
		
		System.out.println("80.0:"+hm.containsValue(80.0));
		
		System.out.println(hm.putIfAbsent("Ram", 78.0));//return value but does not replace value
		System.out.println(hm);
		
		System.out.println(hm.putIfAbsent("laxmi", 98.5));//return null and add laxmi and its value
		System.out.println(hm);
		
		
	}

}
