package com.test;

import java.util.Scanner;

import com.pojoclass.Drama;
import com.daoclass.*;

public class DramaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Entertain e=new DramaEntertainment();
		int choice;
		do
		{
			System.out.println("1.Add Drama");
			System.out.println("2.Update Drama");
			System.out.println("3.Show Details of Drama");
			System.out.println("4.Delete Drama");
			System.out.println("5.Search Drama");
			System.out.println("6.Exit");
			
			System.out.println("........WELCOME TO ENTERTAINMENT WORLD.....");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: 
			{
				e.addDrama();
				break;
			}
			case 2:
			{
				e.updateDrama();
				break;
			}
			case 3:
			{
				e.showDrama();
				break;
			}
			case 4:
			{
				e.deleteDrama();
				break;
			}
			case 5:
			{
				e.searchDrama();
				break;
			}
			case 6:
			{
				System.exit(0);
			}
			
			}
			
			
		}while(true);
	}

}
