package com.lab;
import java.util.Scanner;

class TechNumber
{
	int num;
    int count=0;
	int square=1;
	int sum=0;
	int sq;
	void checkTech(int num,int original)
	{
		while(num!=0)
		{
		count++;
		num/=10;
		}
		System.out.println("count: "+count);
		for(int i=1;i<=count/2;i++)
		{
			square=square*10;
			
		}
		System.out.println("square : "+square);
		if(count%2==0)
		{
			System.out.println(original);
			int n1=original/square;
			System.out.println("num 1: "+n1);
			int n2=original%square;
			System.out.println("num 2: "+n2);
			 sum=n1+n2;
			System.out.println("sum is: "+sum);
			 sq=sum*sum;
			System.out.println("square is: "+sq);
			if(original==sq)
			{
				System.out.println(original+" is tech number.");
			}
			else
			{
				System.out.println(original+" number is not number.");
			}
		}
		else
		{
			System.out.println("enter number even number of digits.");
		}
	}
}
public class TechNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number: ");
       int num=sc.nextInt();
       int  original=num;
       TechNumber t1=new TechNumber();
       t1.checkTech(num,original);
    		   
       
	}

}
