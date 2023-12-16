package com.comparatordemo;

import java.util.Comparator;

public class NameAgeComparator implements Comparator<Student> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if (s1.getName().compareTo(s2.getName()) == 0)
			if (s1.getRollNo() > s2.getRollNo())
				return 1;
			else if (s1.getRollNo() < s2.getRollNo())
				return -1;
			else
				return 0;
		else
			return s1.getName().compareTo(s2.getName());
	}

}
