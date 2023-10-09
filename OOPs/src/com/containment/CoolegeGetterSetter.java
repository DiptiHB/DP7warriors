package com.containment;

public class CoolegeGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student11 s1=new Student11();
		s1.setSId(1);
		s1.setName("Dipti");
		s1.setCourse(new Course() );
		s1.getCourse().setCId(102);
		s1.getCourse().setCName(".net");
		s1.getCourse().setFees(24000);
		System.out.println(s1);
	}

}
