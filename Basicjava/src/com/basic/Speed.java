package com.basic;

import java.util.Scanner;


public class Speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Distance covered");
		int dis=sc.nextInt();
		System.out.println("Enter time taken");
		int time=sc.nextInt();
		int speed=dis/time;
		System.out.println("speed of car= "+speed+"Km/hr");
		sc.close();
		
		}
	

}
