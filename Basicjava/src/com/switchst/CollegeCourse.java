package com.switchst;

import java.util.Scanner;

public class CollegeCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO REAM WORLD UNIVERSITY");
		System.out.println("enter your name: ");
		String name=sc.next();
		System.out.println("enter branch name you want to take admission: 1: MBA,2: MCA");
		String branch= sc.next();
		System.out.println("enter your marks:");
		int passingCriteria=sc.nextInt();
		
		switch(branch)
		{
		case "MBA":
			System.out.println(name+" you have choosen MBA!! its available in university.");
	
			break;
			
		case "MCA":
		System.out.println(name+" you have choosen MCA !! its available in university.");
	
			
		switch(passingCriteria)
			{
			case 1:
				if(passingCriteria>=75)
				{
				  System.out.println(" congratulations!!you got admission for MBA");
			    }   
					else
					{
					System.out.println(" you are not eligible.");
					}
			
			case 2:
				if(passingCriteria>70)
				System.out.println("congratulations!! you got admission for mca");
				break;
				default: System.out.println("sorry you are not eligible.");
			}
			break;
	
			default:
				System.out.println("enter correct branch name.");
		}
		sc.close();
	}
		
		
		
		
	}



