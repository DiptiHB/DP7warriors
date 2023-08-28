package com.ifelse;
import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your age");
    int age=sc.nextInt();
    if(age>=18)
    {
    System.out.println("you can vote");
    }
    else {
    	System.out.println("you can't vote");
    }
sc.close();
}
}