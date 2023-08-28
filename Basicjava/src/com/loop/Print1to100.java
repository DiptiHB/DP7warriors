package com.loop;

public class Print1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
		    {
				System.out.println("bye");
		    }
			else if(i%3==0)
			{
				System.out.println("hello");
			}
			else if(i%5==0)
			{
				System.out.println("welcome");
			}
			else
			{
		      System.out.println(i);
			}
		}
		
		

	}

}
