package com.containment;
import java.util.Scanner;
public class CollegeUserINput {
	static Scanner sc=new Scanner(System.in);
	
	void enterStudDetails(Student11 s)
	{
		System.out.println("enter student id: ");
		s.setSId(sc.nextInt());
		System.out.println("enter student name: ");
		s.setName(sc.next());
		
		s.setCourse(new Course());
		System.out.println("enter course id: ");
		s.getCourse().setCId(sc.nextInt());
		System.out.println("enter course name");
		s.getCourse().setCName(sc.next());
		System.out.println("enter couse fees ");
		s.getCourse().setFees(sc.nextInt());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeUserINput z=new CollegeUserINput();
		Student11 s1=new Student11();
		Student11 s2=new Student11();
         z.enterStudDetails(s1);
         z.enterStudDetails(s2);
        System.out.println(s1);
        System.out.println(s2);
	}

}
