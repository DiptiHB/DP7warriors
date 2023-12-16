package com.arrylistlogical;
import java.util.*;

public class EmployeeArrayLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>emp=new ArrayList<>();
		emp.add(new Employee(1,"Dipti",85000));
		emp.add(new Employee(2,"Abhi",80000));
		emp.add(new Employee(3,"Ram",75000));
		for(Employee e:emp)
		{
			System.out.println(e);
		}

	}

}
