package com.facorymethodpattern;

import java.util.Scanner;

public class HireDeveloper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the developer to  hire(java,python,fullstack developer: ) :");
		String dType=sc.next();
		GetDeveloperType gd=new GetDeveloperType();
		Developer d=gd.getDeveloper(dType); 
		if(d==null)
		{
			System.out.println("developer not found..");
			
		}
		else {
			System.out.println("------------------------------------");
			System.out.println("enter employee name :");
			d.setName(sc.next());
			System.out.println("--------------------------------------");
			System.out.println("welcome to our company--:)"+d.getName());
			d.salaryPaid();
			System.out.println("salary paid: "+d.salary);
			d.workinhHours();
			System.out.println("Working hours :"+d.noOfHours);
			System.out.println("skill set: ");
			d.skillSet();
			System.out.println("-------------------------------------------");
			
		}	
			
		}

	}


