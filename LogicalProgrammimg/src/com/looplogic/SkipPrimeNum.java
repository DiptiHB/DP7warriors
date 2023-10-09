package com.looplogic;

public class SkipPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 int num=50;
		 int flag=0;
		 int count=1;
		 for(int i=2;i<num;i++)
		 {
			 flag=0;
			 for (int j=2;j<i;j++)
			 {
				 if(i%j==0)
				 {
					 flag=1;
				 }
			 }
			 if(flag==0)
			 {
				 count++;
				 if(count%2==0)
				 {
				 System.out.println(i);
				 }
			 }
		 } 

	}

}
