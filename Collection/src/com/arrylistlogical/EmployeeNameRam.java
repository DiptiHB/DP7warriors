package com.arrylistlogical;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeNameRam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>emp=new ArrayList<>();
		emp.add(new Employee(1,"Dipti",55000));
		emp.add(new Employee(2,"Abhi",45000));
		emp.add(new Employee(3,"Vishnu",9000));
		emp.add(new Employee(3,"Ram",8000));
		emp.add(new Employee(3,"Shalu",30000));
		emp.add(new Employee(3,"Avi",9000));
		Iterator<Employee>itr=emp.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			if(e.getName()=="Ram")
			{
				System.out.println(e);
			}
		}

	}

}
