package com.hashmap;

import java.util.*;

public class StudentCourseHashMap {
	public static void sortMarks(HashMap<Student,Course>hm)
	{
		TreeMap<Student,Course>tm=new TreeMap<>(new StudentMarksComparator());
		tm.putAll(hm);
		for(Map.Entry<Student, Course>e:tm.entrySet())
		{
			System.out.println(e.getKey()+"---->"+e.getValue().getcName());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,Course>map=new HashMap<>();
		map.put(new Student(1,"Dipti",89), new Course(111,"java",55000));
		map.put(new Student(2,"Ram",75), new Course(112,"python",35000));
		map.put(new Student(3,"Laxmi",69), new Course(113,".net",45000));
		map.put(new Student(4,"Radha",99), new Course(114,"ruby",32000));
		map.put(new Student(5,"Devaki",55), new Course(115,"java",55000));
		
		sortMarks(map);

	}

}
