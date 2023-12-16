package com.hashmap;

import java.util.Objects;

public class Student1 {
	private int id;
	private String name;
	private String course;
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	public Student1(int id, String name, String java) {
		super();
		this.id = id;
		this.name = name;
		this.course = java;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String Course) {
		this.course = course;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, course, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return id == other.id && Objects.equals(course, other.course) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", java=" + course + "]";
	}
	

}
