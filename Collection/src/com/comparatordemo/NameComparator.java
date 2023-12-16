package com.comparatordemo;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		if(p1.getName().compareTo(p2.getName())==0)
		{
			if(p1.getAge()>p2.getAge())
			
			return 1;
			else if(p1.getAge()<p2.getAge())
				return -1;
			else
				return 0;
		}
		else
			return p1.getName().compareTo(p2.getName());
	}

}
