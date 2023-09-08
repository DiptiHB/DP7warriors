package com.looplogic;
import java.util.Scanner;
public class Armstrong2 {

	
		// TODO Auto-generated method stub
		static void armstrongno(int num)
		{   int count=0;
			int original=num;
		    int original2=num;
			int rem=0;
			int sum=0;
			while(num!=0)
			{
				
		      count++;
		      num/=10;
				
			}	
			while(original!=0)
			{
				int pow=1;
			    rem=original%10;
			    for(int i=1;i<=count;i++)
			    {
			    	pow=pow*rem;
			    }
				sum=sum+pow;
				original=original/10;
			}
				
		    System.out.println("sum="+sum);
			if(original2==sum)
			{
				System.out.println(original2+" is Armstrong number");
			}
			else
			{
				System.out.println(original2+" is not armstrong number");
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number: " );
			int num=sc.nextInt();
			armstrongno(num);
			sc.close();			

	}

}
