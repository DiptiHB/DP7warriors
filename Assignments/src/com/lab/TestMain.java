package com.lab;
import java.util.Scanner;
class VolumeCalculator
{
	double radius;
	double height;
	int len;
	int br;
	int high;
	VolumeCalculator()
	{
		
		
	}	
	void calculateVolume( double radius,double height)
	{
		float pi=3.14f;
		double r1=pi*radius*radius*height;
		System.out.println("volume of cylinder is: "+r1);
	}
	void calculateVolume(int len,int br,int high)
	{
		int r2=len*br*high;
		System.out.println("volume of cuboid is :"+r2);
	}
	
}
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      VolumeCalculator v1=new VolumeCalculator();
      System.out.println("WELCOME TO VOLUME CALCULATOR!");
      System.out.println("1. find volume od cylinder ");
      System.out.println("2.find volume of cuboid ");
     // System.out.println("enter your choice: ");
      int n;
      
      do
      {
    	  System.out.println("enter your choice: ");
          n=sc.nextInt();
          if(n==1)
      {
    	  System.out.println("enter radius: ");
    	  double radius=sc.nextDouble();
    	  System.out.println("enter height: ");
    	  double height=sc.nextDouble();
    	  v1.calculateVolume(radius, height);
    	  
      }
      else
      {
    	  System.out.println("enter length: ");
    	  int len=sc.nextInt();
    	  System.out.println("enter breadth: ");
    	  int br=sc.nextInt();
    	  System.out.println("enter height: ");
    	  int high=sc.nextInt();
    	  v1.calculateVolume(len, br, high);
      }
      }while(true);
	}

}
