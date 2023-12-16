package com.mapassignment;

public class Person implements Comparable<Person>{
	private int Age;
	private String name;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String name) {
		super();
		Age = age;
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [Age=" + Age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(p.getName());
	}
	

}
