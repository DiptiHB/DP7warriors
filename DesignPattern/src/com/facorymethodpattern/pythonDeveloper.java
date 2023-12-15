package com.facorymethodpattern;

import java.util.Arrays;

public class pythonDeveloper extends Developer {

	pythonDeveloper()
	{
		
	}
	pythonDeveloper(String name)
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
		String skills[]= {"Python","ML","numph"};
		System.out.println(Arrays.toString(skills));
	}

}
