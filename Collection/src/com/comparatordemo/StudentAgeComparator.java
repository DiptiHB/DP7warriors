package com.comparatordemo;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getAge()-s2.getAge();
	}

}
