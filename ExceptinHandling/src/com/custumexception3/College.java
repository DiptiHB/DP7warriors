package com.custumexception3;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	int id;
	String name;
	public Student() 
	{
		super();
	}

	public Student(int id, String name, int[] subMarks)
	{
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void percentage(int subMarks[]) 
	{
		int total=0;
		float percentage=0f;
		for (int i = 0; i < subMarks.length; i++) 
		{
			try
			{
				if (subMarks[i] < 0) 
				{
					throw new InvalidMarksException("invalid marks!");
				}

			} catch (InvalidMarksException e) 
			{
				System.out.println(e);
			}
			total += subMarks[i];
			percentage = (total / 5) * 100;
			
			if (percentage > 40) 
			{
				System.out.println(name + "your percentage is: " + percentage);
			} else 
			{
				System.out.println("SORRY! you are failed..keep FIGHTING:)");
			}
		}
	}

	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("id:");
		int id = sc.nextInt();
		int marks[] = new int[5];

		System.out.println("enter 5 subjects marks: ");
		for (int i = 0; i < 5; i++) 
		{
			marks[i] = sc.nextInt();
		}
		s1.percentage(marks);
	}

}
