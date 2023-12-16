package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.treemap.MarksComparator;

public class StudentHashMap2 {
	public static void sortByMarks(HashMap<Student,String>hm)
	{
		TreeMap<Student,String>tm=new TreeMap<>(new MarksComparator());
		tm.putAll(hm);
		for(Map.Entry<Student, String>e:tm.entrySet())
		{
			System.out.println(e.getKey()+"--->"+e.getValue());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,String>shm=new HashMap<>();
		shm.put( new Student(101,"vishnu",50),"java");
		shm.put( new Student(102,"Ram",85),".net");
		shm.put( new Student(103,"geeta",79),"java");
		shm.put( new Student(104,"angad",65),"python");
		shm.put( new Student(104,"anjali",65),"c++");
		shm.put( new Student(101,"priya",93),"html");
		
		for(Map.Entry<Student, String>e:shm.entrySet())
		{
			System.out.println("details:"+e.getKey());
			System.out.println("Course: "+e.getValue());
			System.out.println("---------------------------------");
		}
		sortByMarks(shm);

	}

}
