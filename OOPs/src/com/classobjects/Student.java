package com.classobjects;

public class Student {
	int studId;
	String name;
	float marks;
	void display()
	{
		System.out.println(studId+" "+name+" "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s1.studId=1;
		s1.name="Dipti";
		s1.marks=90f;
		
		s2.studId=2;
		s2.name="Rudrapriya";
		s2.marks=80;
		s1.display();
		s2.display();
	}

}
