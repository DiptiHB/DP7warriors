package com.looplogic;

import java.util.Scanner;

public class PerfectNum {
 static void perfectno(int num)
 {
	 int sum=0;
	 for(int i=1;i<num;i++)
	 {
		 if(num%i==0)
		 {
			 sum+=i;
		 }
	 }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

	}

}
