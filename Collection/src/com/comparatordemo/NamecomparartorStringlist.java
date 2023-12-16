package com.comparatordemo;

import java.util.Comparator;

public class NamecomparartorStringlist implements Comparator<StudentName>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(StudentName s1, StudentName s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareTo(s2.getName());
	}

}
