package com.arraylist;
//create arrayList using three constructor
import java.util.*;
public class ArrayListConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Double>a=new ArrayList<>();
		a.add(5.5);
		System.out.println(a);
		ArrayList<Double>a1 =new ArrayList<Double>(6);
		a1.add(8.5);
		System.out.println(a1);
		
		ArrayList <Double>a2=new ArrayList<Double>(a1);
		System.out.println(a2);
	}

}
