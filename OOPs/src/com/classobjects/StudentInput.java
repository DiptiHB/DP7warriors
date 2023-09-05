package com.classobjects;

import java.util.Scanner;

public class StudentInput {

	
		// TODO Auto-generated method stub
		int studId;
		String name;
		float marks1;
		float marks2;
		float marks3;
		float per;
		char grade;
		
		void percent()
		{
			per=((marks1+marks2+marks3)/300)*100;
		}
		void calgrade()
		{
			if(per>=90)
			
				grade='A';
			
			else if(per>=75)
			
				grade='B';
			
			else if(per>=60)
			
				grade='C';
			
			else if(per>=40)
			
				grade='D';
			
			else
			
				grade='F';
			
		}
		
		void display()
		{
			System.out.println("id: "+studId );
			System.out.println("name: "+name);
			System.out.println("percentage: "+per);
			
			if(grade=='F')
			{
				System.out.println("Sorry you have failed..!Try hard next time .KEEP FIGHTING:)");
			}
			else
			{
				System.out.println("congratulations!! you have passed with "+grade);
			}
			
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			StudentInput s1=new StudentInput ();
			System.out.println("Enter student ID : ");
			s1.studId=sc.nextInt();
			System.out.println("enter student name: ");
			s1.name=sc.next();
			System.out.println("Enter student marks 1 : ");
			s1.marks1=sc.nextFloat();
			System.out.println("Enter student marks 2 : ");
			s1.marks2=sc.nextFloat();
			System.out.println("Enter student marks 3 : ");
			s1.marks3=sc.nextFloat();

			s1.percent();
			s1.calgrade();
			s1.display();
			sc.close();
	}

}
