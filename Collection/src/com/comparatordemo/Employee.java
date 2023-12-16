package com.comparatordemo;
//WAP to create a class Employee with (name, designation and age).Now create and add Employee 
//objects elements to Arraylist. Print ArrayList

//9)Add Profile(state,country) object in Employee object. Do sorting of employees on the country basis.
public class Employee implements Comparable<Employee> 
{
	private int id;
	private String name;
	private String design;
	private int age;
	private String country;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id,String name, String design, int age,String country) {
		super();
		this.id=id;
		this.name = name;
		this.design = design;
		this.age = age;
		this.country=country;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee id: "+id+" name=" + name + ", design=" + design + ", age=" + age +" Country="+country;
	}
//	@Override
//	public int compareTo(Employee e) {
//		// TODO Auto-generated method stub
//		if(this.getId()==e.getId())
//			return 0;
//		else
//			if(this.getId()>e.getId())
//				return 1;
//			else
//				return -1;
//	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		Integer i=e.getId();
		Integer j=this.getId();//collection work on object so convert into Integer Wrapper class
		return i.compareTo(j);//used in built method compareTo
	}
	
	
	
	

}
