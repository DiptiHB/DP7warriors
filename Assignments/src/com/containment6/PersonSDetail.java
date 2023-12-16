package com.containment6;

public class PersonSDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1=new Address("Pune","Maharashtra","India");
		Address a2=new Address("Surat","Gujarat","India");
		Address a3=new Address("Banglore","Karnataka","India");
		
		
		Person p1=new Person("Dipti",'F',25,a1);
		Person p2=new Person("Krima",'F',23,a2);
		Person p3=new Person("Milind",'M',30,a3);
		Person p4=new Person("Diya",'F',35,a1);
		Person p5=new Person("abhishek",'M',22,a2);
		Person p6=new Person("Dipshikha",'F',20,a3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		

	}

}
