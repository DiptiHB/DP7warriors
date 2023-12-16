package com.arrylistlogical;

public class Employee {
	private int id;
	private String name;
	private int Salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "\nEmployee id: " + id + "\nname: " + name + "\nSalary: " + Salary ;
	}
	

}
