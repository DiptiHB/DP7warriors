package com.operators;
import java.util.Scanner;
public class VolumeofCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  Radius:");
	    double rad=sc.nextDouble();
		System.out.println("enter  height:");
		double height=sc.nextDouble();
		double result=(Math.PI)*rad*rad*height;
		System.out.println("volume of cylinder is: "+result);
		sc.close();
	    

	}

}
