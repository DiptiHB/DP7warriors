package com.facorymethodpattern;

public class GetDeveloperType {
	public Developer getDeveloper(String type)
	{
		if(type==null)
			return null;
		else if(type.equalsIgnoreCase("java"))
			return new javaDevloper();
		else if(type.equalsIgnoreCase("python"))
			return new pythonDeveloper();
		else if(type.equalsIgnoreCase("FullStackDeveloper"))
			return new FullStackDeveloper();
		
		return null;
		
	}

}
