package com.facorymethodpattern;

import java.util.Arrays;

public class javaDevloper extends Developer{

	public javaDevloper() {
		// TODO Auto-generated constructor stub
	}
	javaDevloper(String name)
	{
		super(name);
	}
	@Override
	public void salaryPaid() {
		salary=65000;
		
	}

	@Override
	public void skillSet() {
		String skills[]= {"core java","mySql","JDBC"};
		System.out.println(Arrays.toString(skills));
		
	}

}
