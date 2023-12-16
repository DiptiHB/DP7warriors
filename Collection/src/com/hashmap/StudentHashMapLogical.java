package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentHashMapLogical {
	public static void createCountHashMap(HashMap<Student,String>hm)
	{
		HashMap<String,Integer> h1=new HashMap<>();
		//int count;
		for(Map.Entry<Student, String>e:hm.entrySet())
		{
			String course=e.getValue();
			if(h1.containsKey(course))
			{
				//count=h1.get(course);
				//count=count+1;
				h1.put(course, h1.get(course)+1);
			}
			else
			{
				h1.put(course, 1);
			}
		}
		for(Map.Entry<String, Integer>e:h1.entrySet())
		{
		System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
	}
	public static void courseNameMap(HashMap<Student,String>hm)
	{
		HashMap<String,ArrayList<String>> h1=new HashMap<>();
		ArrayList<String>names;
		for(Map.Entry<Student, String>e:hm.entrySet())
		{
			String course=e.getValue();
			if(h1.containsKey(course))
			{
				names=h1.get(course);
				
			}
			else
			{
			names=new ArrayList<>();
			}
			names.add(e.getKey().getName());
			h1.put(course, names);
		}
		
		for(Map.Entry<String, ArrayList<String>>e:h1.entrySet())
		{
			
		System.out.println(e.getKey());
		for(String s:e.getValue())
		{
			System.out.println(s);
			
		}
		System.out.println("-------------------------------------------------");
		}
		
	}

 public static void courseStudentMap(HashMap<Student,String>hm)
{
	HashMap<String,ArrayList<Student>> h1=new HashMap<>();
	ArrayList<Student>studs;
	for(Map.Entry<Student, String>e:hm.entrySet())
	{
		String course=e.getValue();
		if(h1.containsKey(course))
		{
			studs=h1.get(course);
			
		}
		else
		{
		studs=new ArrayList<>();
		}
		studs.add(e.getKey());
		h1.put(course, studs);
	}
	
	for(Map.Entry<String, ArrayList<Student>>e:h1.entrySet())
	{
		
	System.out.println(e.getKey());
	for(Student s:e.getValue() )
	{
		System.out.println(s);
		
	}
	System.out.println("-------------------------------------------------");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,String>shm=new HashMap<>();
		shm.put( new Student(101,"vishnu",50),"java");
		shm.put( new Student(102,"anjali",85),".net");
		shm.put( new Student(103,"anjali",79),"java");
		shm.put( new Student(104,"anjali",65),"python");
		shm.put( new Student(105,"angad",65),".net");
		shm.put( new Student(101,"priya",93),"html");
		shm.put( new Student(106,"prisha",93),".net");
		
		for(Map.Entry<Student, String>e:shm.entrySet())
		{
			System.out.println("details:"+e.getKey());
			System.out.println("Course: "+e.getValue());
			System.out.println("---------------------------------");
		}
		createCountHashMap(shm);
		System.out.println("-----------------------------------");
		courseNameMap(shm);
		System.out.println("-----------------------------------");
		courseStudentMap(shm);
	}


}
