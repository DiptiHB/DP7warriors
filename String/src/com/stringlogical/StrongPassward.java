package com.stringlogical;

import java.util.Scanner;

public class StrongPassward {
	static void passcheck(String s) 
	{
		int cap = 0;
		int spe = 0;
		int spc = 0;
		if (s.length() >= 8) 
		{
			char st[] = s.toCharArray();
			for (int i = 0; i < st.length; i++) 
			{
				if (st[i] > 65 && st[i] < 90) 
				{
					cap++;
					if (st[i] == '@' || st[i] == '#')
					{
						spe++;
						if (st[i] != 32)
						{
							spc++;
							System.out.println("you have entered strong password");
						}
					}
				}
			}
		} 
		else 
		{
			System.out.println("length of password must be greater or equal to 8");
		}
		if (spc == 1)
		{
			System.out.println("password should not contain space in between");
		}

		if (spe == 0) 
		{
			System.out.println("password should contain atleast one special character");
		}

		if (cap == 0) 
		{
			System.out.println("password should contain atleast one capital letter");

		}

	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name :");
		String name=sc.next();
		System.out.println(""+name);
		System.out.println("Enter password: ");
		String pw=sc.next();
		passcheck(pw);
		

	}

}
