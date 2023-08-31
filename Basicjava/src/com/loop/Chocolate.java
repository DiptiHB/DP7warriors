package com.loop;

import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rupees: ");
		int repee=sc.nextInt();
		int choco=1;
		int wrapper=0;
		
		for(int i=1;i<=repee;i++)
		{
			
			choco++;
			wrapper++;
			System.out.println("cholate you brought: "+choco );
			
			if(choco%3==0)
			{
				if(wrapper%3==0)
				{

					choco++;
					
				}
			}
		}
		
		System.out.println("total chocolate you got: "+(choco) );
        sc.close();
	}

}
