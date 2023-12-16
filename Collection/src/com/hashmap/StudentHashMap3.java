package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course(1,"java",50000);
		Course c2=new Course(2,".net",45000);
		Course c3=new Course(3,"python",38000);
		
		HashMap<Student,Course> shm=new HashMap<>();
		shm.put(new Student(101,"Dipti",80), c3);
		shm.put(new Student(102,"Vishnu",80), c1);
		shm.put(new Student(103,"Ram",80), c2);
		shm.put(new Student(104,"Devaki",80), c3);
		shm.put(new Student(105,"Anjali",80), c1);
		
		for(Map.Entry<Student,Course>e:shm.entrySet())
		{
			System.out.println("Student details: "+e.getKey());
			System.out.println("Course details: "+e.getValue());
			System.out.println("-------------------------------");
		}
//		for(Map.Entry<Student,Course>e:shm.entrySet())
//		{
//			System.out.println("Student id: "+e.getKey().getId()+" name: "+e.getKey().getName());
//			System.out.println("Course details: "+e.getValue().getcName()+" fees: "+e.getValue().getFees());
//			System.out.println("-----------------------------------");
//			
//		}
		
		
		
		

	}

}
