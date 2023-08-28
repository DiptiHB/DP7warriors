package com.loop;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int digit=sc.nextInt();
		int count=0;
		if(digit==0)
		{
			count=1;
		}
		else
		{
		for (int num=digit;num!=0;num/=10)
		{
			count++;
		}
		}
		System.out.println("number of digits are:" +count);
		sc.close();
	}

}
/*  we are taking number 1234 and we want o/p as no.of digits are 4 .how it will run ?->
  first it will check digit is 0/not.if its zero then it will print count as 1.if its not 
  zero then it will go for else condition where is for loop we used there 
  int num take digits means the input number you have given.then it will check number is not equal to zero.
  then we will divide number by 10.so what we will get.1)1234/10=123 
  2)123/10=12 3)12/10=1 4)1/10=0[why 0-->because we taken number in integer type variable so 
  it will not take0.1 but only 0,now it will check again num is not equal to 0 
  condition fail and it will come out of loop ]will print number of digits in any number
   
   */
 