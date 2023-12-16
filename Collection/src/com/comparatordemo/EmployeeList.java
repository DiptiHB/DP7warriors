package com.comparatordemo;
//4)Now modify Employee class so that it implements Comparable interface’s compareTo 
//method.Sorting should be done based on id in which use < , > & == technique.

//5)Now do descending sort of Employee.id in Employee arraylist using < , > & == technique.


import java.util.*;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>al=new ArrayList<>();
		al.add(new Employee(1,"Dipti","HR",45,"India"));
		al.add(new Employee(8,null,"HR",45,"Australia"));
		al.add(new Employee(2,"Ram","finance manager",35,"france"));
		al.add(new Employee(5,"himakshi","developer",32,"India"));
		al.add(new Employee(4,"Vishanu","market Head",34,"German"));
		al.add(new Employee(3,"Shree","interpreter",47,"India"));
		al.add(new Employee(6,"sakshima","manager",58,"USA"));
		
		for(Employee e:al)
		{
			System.out.println(e);
		}
		System.out.println("------------------------------------------------------");
		Collections.sort(al);
		for(Employee e:al)
		{
			System.out.println(e);
		}
		
		

	}

}
