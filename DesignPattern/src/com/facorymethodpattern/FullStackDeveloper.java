package com.facorymethodpattern;

import java.util.Arrays;

public class FullStackDeveloper extends Developer{

	public FullStackDeveloper() {
		// TODO Auto-generated constructor stub
	}
	FullStackDeveloper(String name)
	{
		super(name);
	}
	@Override
	public void salaryPaid() {
		// TODO Auto-generated method stub
		salary=55000;
	}

	@Override
	public void skillSet() {
		// TODO Auto-generated method stub
		String skills[]= {"Java","CSS","React","node","HTML","SQL"};
		System.out.println(Arrays.toString(skills));
	}

}
