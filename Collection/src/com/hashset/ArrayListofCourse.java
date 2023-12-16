package com.hashset;
//create a map in which courseobject will be key and arraylist of studentnames 
//will be value 
//<course(1,java,9000) , arraylist{"suraj" , "kailash" }

import java.util.*;
public class ArrayListofCourse {
	public static void creteCourseMap(HashSet<Student>set)
	{
		HashMap<Course,ArrayList<String>>map=new HashMap<>();
		Iterator <Student>itr=set.iterator();
		while(itr.hasNext())
		{
			Student stud=itr.next();
			Course course=stud.getCourse();
			if(map.containsKey(course))
			{
				
				ArrayList<String> al=map.get(course);
				System.out.println(map.get(course));
				al.add(stud.getName());
				map.put(course,al);
				
				
			}
			else
			{
				ArrayList<String>al=new ArrayList<>();
				al.add(stud.getName());
				map.put(course, al);
			}
		}
	     for(Map.Entry<Course, ArrayList<String>>e:map.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student>hs=new HashSet<>();
		hs.add(new Student(1,"Dipti",89,50000,new Course(111,"java",50000)));
		hs.add(new Student(2,"Prisha",31,45000,new Course(112,".net",45000)));
		hs.add(new Student(3,"Sakshima",65,25000,new Course(113,"python",30000)));
		hs.add(new Student(4,"Himali",33,45000,new Course(111,"java",50000)));
		hs.add(new Student(5,"Toshada",30,25000,new Course(114,"c++",25000)));
		hs.add(new Student(6,"Dev",25,50000,new Course(111,"java",50000)));
		
		creteCourseMap(hs);

	}

}
