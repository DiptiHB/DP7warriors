package com.hashmap;

import java.util.*;

public class DaysOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>map1=new HashMap<>();
		map1.put("Jan", 31);
		map1.put("feb", 28);
		map1.put("Mar", 31);
		map1.put("Apl", 30);
		map1.put("may", 31);
		map1.put("Jun", 30);
		HashMap<Integer,Integer>map2=new HashMap<>();
		
		for(Map.Entry<String,Integer>e:map1.entrySet())
		{
			if(map2.containsKey(e.getValue()))
			{
				map2.put(e.getValue(),map2.get(e.getValue())+1);
			}
			else
			{
				map2.put(e.getValue(), 1);
			}
		}
		System.out.println(map2);

	}

}
