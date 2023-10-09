package com.containment;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course(1,"java",25000f);
		Course c2=new Course(2,".net",23000f);
		Course c3=new Course(3,"python",20000f);
		
		Student11 s1=new Student11(1,"Dipti",c1);
        Student11 s2=new Student11(2,"Pratiksha",c2);
        Student11 s3=new Student11(3,"Deepshikha",c1);
        Student11 s4=new Student11(4,"Madhuri",c3);
        Student11 s5=new Student11(5,"raksha",c1);
        Student11 s6=new Student11(6,"Saurabh",c2);
        
        
        System.out.println(s1);
        System.out.println("-----------------------------------------");
        System.out.println(s2);
        System.out.println("-----------------------------------------");
        System.out.println(s3);
        System.out.println("-----------------------------------------");
        System.out.println(s4);
        System.out.println("-----------------------------------------");
        System.out.println(s5);
        System.out.println("-----------------------------------------");
        System.out.println(s6);
        
        
	}

}
