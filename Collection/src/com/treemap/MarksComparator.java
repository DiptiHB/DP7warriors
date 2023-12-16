package com.treemap;

import java.util.Comparator;

import com.hashmap.Student;

public class MarksComparator implements Comparator<Student>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getMarks()-s2.getMarks();
	}

}
