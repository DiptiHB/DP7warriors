package com.comparable;
import java.util.*;
public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stdList=new ArrayList<>();
		stdList.add(new Student(1,"Dipti",85.5f));
		stdList.add(new Student(2,"Anil",55.5f));
		stdList.add(new Student(3,"ram",75.5f));
		stdList.add(new Student(4,"vishnu",91.5f));
		stdList.add(new Student(5,"aadi",65.5f));
		stdList.add(new Student(6,"Arya",86.5f));
		for(Student s1:stdList)
		{
			System.out.println(s1);
		}
		Collections.sort(stdList);
		System.out.println("After sorting------------------------------");
		for(Student s1:stdList)
		{
			System.out.println(s1);
		}
		System.out.println("--------------------------------");
		for(Student s1:stdList)
		{
			System.out.println(s1.getName()+" "+s1.getMarks());
		}

	}

}
