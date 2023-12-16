package com.linkedhashmap;
import java.util.*;
public class LinkedHashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Double>lhm=new LinkedHashMap<>();
		lhm.put("Dipti", 86.0);
		lhm.put("Devaki", 88.0);
		lhm.put("Manee", 90.0);
		lhm.put("Sharvari", 92.0);
		lhm.put("Pratiksha", 96.0);
		lhm.put("Amayra", 75.0);
		for(Map.Entry<String, Double>e:lhm.entrySet())
		{
			System.out.println(e.getKey()+"="+e.getValue());
		}
		System.out.println("------------------------------------");
		System.out.println("marks of pratiksha: "+lhm.get("Pratiksha"));
		System.out.println("marks of Dipti: "+lhm.get("Dipti"));
	}

}// it maintain insertion order as well as access order too.
