package com.encapsulations;

public class Employee {

	    private int employeeId;
		private String name;
		private int salary;
		private String department;
		
		public void setEmployeeId(int employeeId)
		{
			this.employeeId=employeeId;
		}
		public int getEmployeeId()
		{
			return employeeId;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		public void setSalary(int salary)
		{
			this.salary=salary;
		}
		public int getSalary()
		{
			return salary;
		}
		public void setDepartment(String department)
		{
			this.department=department;
		}
		public String getDepartment()
		{
			return department;
		}
		public String toString()
		{
			return " "+employeeId+" "+name+" "+salary+" "+department;
		}

	}


