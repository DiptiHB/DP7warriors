package com.mockcode;
import java.util.Scanner;
public class HarshadNo {
	  void checkHarshad(int num)
	  {
		  int origin=num;
		  int sum=0;
		  int rem=0;
		  while(num!=0)
		  {
		  rem=num%10;
		  sum=sum+rem;
		  num/=10;
		  }
		  System.out.println("sum: "+sum);
		  System.out.println("if we divide given nuumber "+origin+" by sum of digits of number which sum is: "+sum);
		  if(origin%sum==0)
		  {
			System.out.println("The number "+origin+" is harshad number!");  
		  }
		  else
		  {
			  System.out.println("The number "+origin+" is not harshad number!"); 
		  }
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int num=sc.nextInt();
        int origin=num;
        HarshadNo h1=new HarshadNo();
        h1.checkHarshad(num);
	}

}
