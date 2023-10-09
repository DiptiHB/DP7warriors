package com.looplogic;
import java.util.Scanner;
public class ExtactDigit {

	static void extract(int num)
	{ 
		int sum=0;
		System.out.println("the digits in number are: "+num);
		while(num!=0)
		{
			int rem=(num%10);
		    sum=sum+rem;
			num/=10;
			
		}
	}
	
    static void reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			System.out.println(num%10);
			rev=rev*10+rev;
			num/=10;
			
			
		}
		System.out.println(rev+" is revese of number");
		
	}
	
	static void palin(int num)
	{
		int original=num;
		int rev=0;
		System.out.println("reverse is:");
		while(num!=0)
		{
		
			System.out.println(num%10);
			rev=rev*10+rev;
			num/=10;	
		}
		if(original==rev)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrom number");
		}
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
     extract(num);
     reverse(num);
     palin(num);
     sc.close();
	}

}
