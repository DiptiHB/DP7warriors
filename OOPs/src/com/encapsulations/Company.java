package com.encapsulations;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee emp=new  Employee();
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter employee id: ");
		 emp.setEmployeeId(sc.nextInt());
		 System.out.println("enter name: ");
		 emp.setName(sc.next());
		 System.out.println("enter salary: ");
		 emp.setSalary(sc.nextInt());
		 System.out.println("enter department: ");
		 emp.setDepartment(sc.next()); 
		 
		 System.out.println("employee id: "+ emp.getEmployeeId() + " employee name: "+emp.getName());
		 System.out.println("salary: "+emp.getSalary()+ " Department: "+emp.getDepartment());
		 
		 Employee emp1=new  Employee();
		 emp1.setEmployeeId(555);
		 emp1.setName("Toshada");
		 emp1.setSalary(120000);
		 emp1.setDepartment("Interpreter");
		 
		 System.out.println("employee id: "+ emp1.getEmployeeId() + " employee name: "+emp1.getName());
		 System.out.println("salary: "+emp1.getSalary()+ " Department: "+emp1.getDepartment());
		 sc.close();

	}

}
