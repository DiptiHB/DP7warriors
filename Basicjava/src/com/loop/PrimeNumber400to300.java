package com.loop;

public class PrimeNumber400to300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
 int num=400,flag=0;
 for(int i=300;i<=num;i++)
 {
     flag=0;
	 for(int j=300;j<=i;j++)
	 {
		 if(i%j==0)
		 {
			 flag=1;
			
		 }
	 }
	 if(flag==0)
	 {
		 System.out.println(i);
	 }
  }
 
 
	}

}
