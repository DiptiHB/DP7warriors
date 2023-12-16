package com.hashmap;
import java.util.*;
public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Student>shm=new HashMap<>();
		shm.put(101, new Student(101,"anjali",65));
		shm.put(102, new Student(102,"vishnu",75));
		shm.put(103, new Student(103,"Ram",59));
		shm.put(103, new Student(103,"meher",93));
		shm.put(104, new Student(104,"arya",91));
		shm.put(105, new Student(105,"priya",86));
//		for(Map.Entry<Integer, Student>e:shm.entrySet())
//		{
//			System.out.println("id: "+e.getKey());
//			System.out.println("details: "+e.getValue());
//			System.out.println("--------------------------------");
//		}
		for(Map.Entry<Integer, Student>e:shm.entrySet())
		{
			System.out.println("id: "+e.getKey());
			System.out.println("details: "+e.getValue().getName());
			System.out.println("--------------------------------");
		}
//		for(Map.Entry<Integer, Student>e:shm.entrySet())
//		{
//			System.out.println("id: "+e.getKey());
//			Student s=e.getValue();
//			System.out.println("Details: "+s.getName());
//			System.out.println("--------------------------------");
//		}

	}

}
