package com.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeListname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>al=new ArrayList<>();
		al.add(new Employee(1,"Dipti","HR",45,"India"));
		al.add(new Employee(8,"laxmi","HR",45,"Australia"));
		al.add(new Employee(2,"Ram","finance manager",35,"france"));
		al.add(new Employee(5,"himakshi","developer",32,"India"));
		al.add(new Employee(4,"Vishanu","market Head",34,"German"));
		al.add(new Employee(3,"Shree","interpreter",47,"India"));
		al.add(new Employee(6,"sakshima","manager",58,"USA"));
		
		for(Employee e:al)
		{
			System.out.println(e);
		}
		Collections.sort(al, new EmployeeNameComparator());
		System.out.println("--------------------------------");

		for(Employee e:al)
		{
			System.out.println(e);
		}
		Collections.sort(al, new CountryComparator());
		System.out.println("--------------------------------");

		for(Employee e:al)
		{
			System.out.println(e);
		}

	}

}
