package com.objectpassing;

import java.util.Scanner;

import com.encapsulations.Employee;

public class company2 {

	
		// TODO Auto-generated method stub
	     
		 static Scanner sc=new Scanner(System.in);
		 static void insertEmployeeDetail(Employee empl)
		 {
		 System.out.println("enter employee id: ");
		 empl.setEmployeeId(sc.nextInt());
		 System.out.println("enter name: ");
		 empl.setName(sc.next());
		 System.out.println("enter salary: ");
		 empl.setSalary(sc.nextInt());
		 System.out.println("enter department: ");
		 empl.setDepartment(sc.next());
		 }
		 public static void main(String[] args) {
			 
			 Employee e1=new  Employee();
			 insertEmployeeDetail(e1);
			 
			// Employee e2=new  Employee();
			// insertEmployeeDetail(e2);
			 
			 //Employee e3=new  Employee();
			// insertEmployeeDetail(e3);
			 
			 System.out.println("********************************************");
			 
			 System.out.println(e1);
			// System.out.println(e2);
			// System.out.println(e3);
			 
			 System.out.println("---------------------------------------------");
			 Employee e4=e1;  // shallow copy
			 e4.setSalary(90000);
			 System.out.println(e1);
			 System.out.println(e4);
			 
			 System.out.println("---------------------------------------------");
			 Employee e5=new Employee();
			 e5=e1; // shallow copy (change in one object reflect in another)
			 System.out.println("**********************************************");
			 System.out.println(e1);
			 e5.setSalary(55000);
			 System.out.println("----------------------------------------------");
			 System.out.println(e1);
			 
	}

}
