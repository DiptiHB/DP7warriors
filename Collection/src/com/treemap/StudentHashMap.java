package com.treemap;

import java.util.HashMap;
import java.util.Map;

import com.hashmap.*;

public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,String>shm=new HashMap<>();
		shm.put( new Student(101,"vishnu",50),"java");
		shm.put( new Student(102,"anjali",85),".net");
		shm.put( new Student(103,"anjali",79),"java");
		shm.put( new Student(104,"anjali",65),"python");
		shm.put( new Student(104,"anjali",65),"c++");
		shm.put( new Student(101,"priya",93),"html");
		
		for(Map.Entry<Student, String>e:shm.entrySet())
		{
			System.out.println("details:"+e.getKey());
			System.out.println("Course: "+e.getValue());
			System.out.println("---------------------------------");
		}

	}

}
