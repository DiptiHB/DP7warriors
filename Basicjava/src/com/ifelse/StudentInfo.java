// calculate percentage of student by accepting diffent subject marks.

package com.ifelse;
import java.util.Scanner;
public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your name:");
    String name= sc.next();
    System.out.println("enter your subject1 marks:");
    int sub1=sc.nextInt();
    System.out.println("enter your subject2 marks:");
    int sub2=sc.nextInt();
    System.out.println("enter your subject3 marks:");
    int sub3=sc.nextInt();
    System.out.println("enter your subject4 marks:");
   int sub4=sc.nextInt();
   System.out.println("enter your subject5 marks:");
   int sub5=sc.nextInt();
    
    int total=sub1+sub2+sub3+sub4+sub5;
    double percent=100*total/500;
    if(percent>40)
    {
    	System.out.println(name+" has scored "+percent+"% and passed,congratulations and you are promoted");
    	
    }
    else
    {
    	System.out.println(name+" you are fail "+percent+"% try hard next time ");
    }
    sc.close();
    
    
	}

}
