package com.inheritance;

import java.util.Scanner;

class Student
{
	private int id;
	private String name;
	private float fees;
	Student()
	{
		
	}
	Student(int id,String name,float fees)
	{
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setFees(float fees)
	{
		this.fees=fees;
	}
	public float getFees()
	{
		return fees;
	}
	public String toString()
	{
		return  "Student id:" + id + "\n name:" + name + "\n fees:" + fees ;
	}

}
class SchoolStud extends Student
{
	private String schoolName;
	private int standard;
	
	SchoolStud()
	{
		
	}
	SchoolStud( int id,String name,float fees,String schoolName,int standard)
	{
		super(id,name,fees);
		this.schoolName=schoolName;
		this.standard=standard;
	}
	
	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}
	public String getSchoolName() 
	{
		return schoolName;
	}
	public void setStandard(int standard)
	{
		this.standard = standard;
	}
	public int getStandard() 
	{
		return standard;
	}
	public String toString()
	{
		return super.toString()+"\n school name: "+schoolName+"\n standard: "+standard;
	}
	
	
}
class CollegeStudent extends Student
{
	private String university;
	private String course;
	CollegeStudent()
	{
		super();
		
	}
	CollegeStudent(int id,String name,float fees,String university,String course)
	{
		super(id,name,fees);
		this.university=university;
		this.course=course;
	}
	
	public void setUniversity(String university) 
	{
		this.university = university;
	}
	public String getUniversity() 
	{
		return university;
	}
	
	public void setCourse(String course) 
	{
		this.course = course;
	}
	public String getCourse() 
	{
		return course;
	}
	public String toString()
	{
		return super.toString()+"\n university: "+university+"\n course: "+course;
	}
	
	
}
public class hirarchiInherit {
//	static Scanner sc=new Scanner(System.in);
//	void StudDetail(Student s)
//	{
//		System.out.println("enter id: ");
//		s.setId(sc.nextInt());
//		System.out.println("enterschool name: ");
//		s.setName(sc.next());
//		System.out.println("enter fees: ");
//		s.setFees(sc.nextFloat());
//	}
//	void schoolDetail(SchoolStud a)
//	{
//		System.out.println("enter school name: ");
//		a.setSchoolName(sc.next());
//		System.out.println("standard: ");
//		a.setStandard(sc.nextInt());
//	}
//	void collegeDetail (CollegeStudent c)
//	{
//		System.out.println("enter university name: ");
//		c.setUniversity(sc.next());
//		System.out.println("enter course: ");
//		c.setCourse(sc.next());
//		
//		
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolStud z=new SchoolStud(1,"dipti",5500f,"st.mary",9);
		
		CollegeStudent x=new CollegeStudent(11,"priya",80000f,"DREAM","Fasion design");
		System.out.println(z);
		System.out.println("--------------------------------------------------------------------");
		System.out.println(x);
	}

}
