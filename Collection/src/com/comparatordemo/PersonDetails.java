package com.comparatordemo;

import java.util.*;

public class PersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>list=new ArrayList<>();
		list.add(new Person(18,"Angad"));
		list.add(new Person(23,"Pratiksha"));
		list.add(new Person(25,"Sumit"));
		list.add(new Person(45,"Anandi"));
		list.add(new Person(13,"Meher"));
		list.add(new Person(13,"Ram"));
		list.add(new Person(46,"Subodh"));
		System.out.println(list);
		Collections.sort(list,new NameComparator());
		System.out.println("-------------------------------------");
		System.out.println(list);

	}

}
