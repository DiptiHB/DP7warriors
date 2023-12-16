package com.lab;

import java.util.Scanner;

public class Score
{
	
	public void checkAward(int score)
	{
//		if(score<40000)
//		{
//			if(score<25000)
//			{
//				System.out.println("CONGRATULATION!!You got award: bronze");
//			}
//			else
//			{
//				System.out.println("CONGRATULATION!!You got award: silver");
//			}
//		}
//		else if(score<60000)
//		{
//			System.out.println("CONGRATULATION!!You got award: gold");
//		}
//		else
//		{
//			System.out.println("CONGRATULATION!!You got award: platenium");
//		}
		String ch=(score<40000)?(score<25000)?"broze":"silver":(score>=60000)?"platenium":"gold";
		System.out.println(ch);
		
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		Score s1=new Score();
		System.out.println("enter score: ");
		int score=sc.nextInt();
		s1.checkAward(score);
		sc.close();
		
		
	}

}
