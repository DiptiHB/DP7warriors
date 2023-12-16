package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Student1hashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student1,Integer>map1=new HashMap<>();
		map1.put(new Student1(1,"Dipti","Java"), 85);
		map1.put(new Student1(2,"Devki",".net"), 82);
		map1.put(new Student1(3,"ram","html"), 30);
		map1.put(new Student1(4,"vishnu","Java"), 90);
		map1.put(new Student1(5,"Shalaka","html"), 55);
		map1.put(new Student1(5,"shalu","ruby"), 65);
		
		HashMap<String,Integer>map2=new HashMap<>();
		
		for(Map.Entry<Student1, Integer>e:map1.entrySet())
		{
			if(map2.containsKey(e.getKey().getCourse()))
			{
				map2.put(e.getKey().getCourse(), map2.get(e.getKey().getCourse())+1);
			}
			else
			{
				map2.put(e.getKey().getCourse(), 1);
			}
		}
		
		System.out.println(map2);

	}

}
