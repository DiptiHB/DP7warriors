package com.hashmap;

import java.util.*;

public class Student1HashMap2 {
	static void passfailStudents(HashMap<Student1, Integer> hm) {
        
		ArrayList<Student1> passList = new ArrayList<>();
        ArrayList<Student1> failList = new ArrayList<>();

        
        for (Student1 stud : hm.keySet()) 
        {  
            int marks = hm.get(stud);
            if (marks >= 40)
            {
                passList.add(stud);
            } 
            else
            {
                failList.add(stud);
            }
        }

        System.out.println("Pass students:");
        for (Student1 student : passList)
        {
            System.out.println(student);
        }

        System.out.println("\nFail students:");
        for (Student1 student : failList)
        {
        	System.out.println(student);      
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student1,Integer>map1=new HashMap<>();
		map1.put(new Student1(1,"Dipti","Java"), 85);
		map1.put(new Student1(2,"Devki",".net"), 82);
		map1.put(new Student1(3,"ram","html"), 30);
		map1.put(new Student1(4,"vishnu","Java"), 90);
		map1.put(new Student1(5,"Suboth",".net"), 25);
		passfailStudents(map1);

	}

}
