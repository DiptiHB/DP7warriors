package com.comparatordemo;

import java.util.*;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> s1=new ArrayList<>();
		s1.add(new Student(1,"Dipti",21));
		s1.add(new Student(12,"Devki",20));
		s1.add(new Student(34,"Supriya",23));
		s1.add(new Student(30,"Supriya",21));
		s1.add(new Student(25,"Urmila",25));
		s1.add(new Student(6,"Umesh",22));
		s1.add(new Student(17,"subodh",21));
		Collections.sort(s1,new RollNoCoparator());
		for(Student s:s1)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
		Collections.sort(s1,new StudentNameComparator());
		for(Student s:s1)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
		Collections.sort(s1,new StudentAgeComparator());
		for(Student s:s1)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");
		Collections.sort(s1,new NameAgeComparator());
		for(Student s:s1)
		{
			System.out.println(s);
		}
	}

}
