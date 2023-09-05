package com.encapsulations;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		 s1.setStudId(10);
		 s1.setName("Ram");
		 s1.setPercent(80);
		 s1.setFaculty("science"); 
		 System.out.println("student id: "+s1.getStudId() + " name: "+s1.getName());
		 System.out.println("percentage: "+ s1.getPercent()+"%" + " Faculty: "+s1.getFaculty());
		 
		 Student s2=new Student();
		 s2.setStudId(11);
		 s2.setName("Parth");
		 s2.setPercent(88);
		 s2.setFaculty("commerce"); 
		 System.out.println("student id: "+s2.getStudId() + " name: "+s2.getName());
		 System.out.println("percentage: "+ s2.getPercent()+"%" + " Faculty: "+s2.getFaculty());
		 
	}

}
