package com.operators;
import java.util.Scanner;
public class AreaCircle {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter radius");
	int rad=sc.nextInt();
	double area=(Math.PI)*rad*rad;
	double perimeter=2*(Math.PI)*rad;
	System.out.println("area= "+area);
	System.out.println("perimeter "+perimeter);
	sc.close();
    }
	
}