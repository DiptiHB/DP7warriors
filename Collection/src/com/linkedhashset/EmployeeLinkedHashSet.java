package com.linkedhashset;

import java.util.*;

public class EmployeeLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Employee>lhs=new LinkedHashSet<>();
		lhs.add(new Employee(1,"Dipti",55000));
		lhs.add(new Employee(2,"Shalaka",85000));
		lhs.add(new Employee(3,"laxmi",45000));
		lhs.add(new Employee(4,"priya",95000));
		lhs.add(new Employee(5,"Himadri",30000));
		lhs.add(new Employee(4,"priya",95000));
		//System.out.println(lhs);
		for(Employee e:lhs)
		{
			System.out.println(e);
		}

	}

}
