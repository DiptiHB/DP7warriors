package com.looplogic;

public class MaxDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=456798;
		int rem=num%10;
		num=num/10;
		int max=0;
		int rem1=0;
		while(num!=0)
		{	
			rem1=num%10;
		 if(rem1>rem)
		 {
			max=rem1; 
		 }
		 num/=10;
		 
		}
		System.out.println(max);

	}

}
