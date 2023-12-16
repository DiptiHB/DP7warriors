package com.arrylistlogical;

import java.util.ArrayList;
import java.util.Iterator;

public class GreaterEmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int max=Integer.MIN_VALUE;
		
		ArrayList<Employee>emp=new ArrayList<>();
		emp.add(new Employee(1,"Dipti",5000));
		emp.add(new Employee(2,"Abhi",45000));
		emp.add(new Employee(3,"Vishnu",5000));
		emp.add(new Employee(3,"Ram",80000));
		emp.add(new Employee(3,"Shalu",30000));
		emp.add(new Employee(3,"Avi",9000));
		Employee highSal=emp.get(0);
		for(Employee e:emp)
		{
			if(e.getSalary()>highSal.getSalary())
			{
				highSal=e;
			}
		}
		System.out.println("highest salary of employee: ");
		System.out.println(highSal);

	}

}
