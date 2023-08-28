package com.ternery;
import java.util.Scanner;

public class VotingEgibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		String status=(age>=18)?"yes":"no";
		System.out.println(status);
		
    sc.close();
	}

}
