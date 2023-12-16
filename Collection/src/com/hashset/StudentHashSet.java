package com.hashset;

import java.util.*;

public class StudentHashSet {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student>hs=new HashSet<>();
		hs.add(new Student(1,"Dipti",89,50000,new Course(111,"java",50000)));
		hs.add(new Student(2,"Prisha",31,45000,new Course(112,".net",45000)));
		hs.add(new Student(3,"Sakshima",65,25000,new Course(113,"python",30000)));
		hs.add(new Student(4,"Himali",33,45000,new Course(111,"java",50000)));
		hs.add(new Student(5,"Toshada",30,25000,new Course(114,"c++",25000)));
		hs.add(new Student(6,"Dev",25,50000,new Course(111,"java",50000)));
		
		for(Student s:hs)
		{
			System.out.println(s);
		}
		System.out.println("---------------------------------------------");
		for(Student s:hs)
		{
			if(s.getFeesPaid()==s.getCourse().getFees())
			{
				if(s.getMarks()<35 &&s.getMarks()>=30)
				{
					s.setMarks(35);
				}
			}
		}
		for(Student s:hs)
		{
			System.out.println(s);
		}
		
	}

}
