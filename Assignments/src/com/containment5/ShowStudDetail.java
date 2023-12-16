package com.containment5;

public class ShowStudDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d=new Department(1,"CS");
		Department d1=new Department(2,"IT");
		Department d2=new Department(3,"Electrical");
		
		StudentDetail s1=new StudentDetail(11,"Dipti",d);
		StudentDetail s2=new StudentDetail(12,"Radha",d1);
		StudentDetail s3=new StudentDetail(13,"Supriya",d2);
		StudentDetail s4=new StudentDetail(14,"Sharu",d);
		
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
	}

}
