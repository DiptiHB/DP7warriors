package com.inheritance;
class Employee
{
	private int id;
	private String name;
	private float salary;

	public Employee() 
	{

	}

	public Employee(int id, String name, float salary) 
	{
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return id;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	public float getSalary()
	{
		return salary;
	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary ;
	}
	
	
}
class Manager extends Employee
{
	int exp;
	String role;
	 Manager()
	 {
		 super();
	 }
	 Manager(int id,String name,float salary,int exp,String role)
	 {
		 super(id,name,salary);
		 this.exp=exp;
		 this.role=role;
	 }
	 public void setExp()
	 {
		 this.exp=exp;
	 }
	 public int getExp()
	 {
		 return exp;
	 }
	 public void setRole(String role)
	 {
		 this.role=role;
	 }
	 public String getRole()
	 {
		 return role;
	 }
	 
	 public String toString()
	 {
		 return super.toString()+"\n experiance: "+exp+"\n role: "+role;
	 }
	
}

public class SingleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1=new Manager(111,"dipti",80000f,3,"interpreter");
		System.out.println(m1);

	}

}
