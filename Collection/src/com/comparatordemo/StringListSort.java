package com.comparatordemo;

import java.util.*;

//WAP to sort the elements of List that contains String objects.Print ArrayList.Sort using 
//Collections.sort(list) method. Print ArrayList.
public class StringListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentName>al=new ArrayList<>();
		al.add(new StudentName("Dipti"));
		al.add(new StudentName("Ram"));
		al.add(new StudentName("Himadri"));
		al.add(new StudentName("Shalaka"));
		al.add(new StudentName("Subodh"));
		
		
		System.out.println(al);
		Collections.sort(al, new NamecomparartorStringlist());
		System.out.println("After sorting: "+al);
		

	}

}
