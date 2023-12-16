package com.hashmap;

import java.util.*;

public class Student1HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean status=true;
		HashMap<Student1,Integer>map=new HashMap<>();
		map.put(new Student1(1,"Dipti","Java"), 85);
		map.put(new Student1(2,"Devki",".net"), 82);
		map.put(new Student1(3,"ram","html"), 30);
		map.put(new Student1(4,"vishnu","Java"), 90);
		map.put(new Student1(5,"Suboth",".net"), 25);
		
		HashMap<String,Integer>passmap=new HashMap<>();
		HashMap<String,Integer>failmap=new HashMap<>();
		
		for(Map.Entry<Student1, Integer>e:map.entrySet())
		{
			
			if(e.getValue()>=40)
			{
			 	passmap.put(e.getKey().getName(), e.getValue());	
			}
			else
			{
				failmap.put(e.getKey().getName(), e.getValue());
			}
		}
		
		System.out.println("Student who passed exam: "+passmap);
		
		System.out.println("Student who failed exam: "+failmap);
		
		

	}

}
