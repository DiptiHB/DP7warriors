package com.daoclass;

import java.util.Scanner;

import com.pojoclass.Drama;

public class DramaEntertainment implements Entertain
{
	Scanner sc=new Scanner(System.in);
	Drama d[]=new Drama[10];
	int count=0;
	
	int dId;
	String name;
	int year;
	String type;
	float rate;
	
	@Override
	public void addDrama() {
		
		System.out.println("Add a Drama");
		System.out.println("Enter the no.of drama you want to add: ");
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter Drama id: ");
			dId=sc.nextInt();
			System.out.println("Enter drama name: ");
			name=sc.next();
			System.out.println("Enter release year: ");
			year=sc.nextInt();
			System.out.println("Enter drama genre: ");
			type=sc.next();
			System.out.println("Enter Rating: ");
			rate=sc.nextFloat();
			
			d[count]=new Drama(dId,name,year,type,rate);
			count++;
			
		}
		System.out.println(" Drama Added successfully!! ");
	}

	@Override
	public void updateDrama() 
	{
		System.out.println("Update drama ");
		System.out.println("enter drama id you want to update ");
		dId=sc.nextInt();
		int i;
		for( i=0;i<count;i++)
		{
			if(dId==d[i].getId() && d[i]!=null)
			{
				System.out.println("what you want to update");
				System.out.println("1.name 2.year 3.genre 4.rating");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
				{
					System.out.println("Enter drama name: ");
					name=sc.next();
					d[i].setDramaName(name);
					break;
				}
				case 2:
				{
					System.out.println("enter year: ");
					year=sc.nextInt();
					d[i].setReleaseYear(year);
					break;
				}
				case 3:
				{
					System.out.println("enter genre: ");
					type=sc.next();
					d[i].setGenre(type);
					break;
				}
				case 4:
				{
					System.out.println("enter rating: ");
					rate=sc.nextFloat();
					d[i].setRating(rate);
					break;
					
				}
				}
				
			}
			System.out.println(d[i]);
		}
		
		System.out.println("Drama updated successfully!!");
		
	}

	@Override
	public void showDrama() {
	 for(int i=0;i<count;i++)
	 {
		 if(d[i]!=null)
		 {
			 System.out.println(d[i]);
		 }
	 }
		
	}

	@Override
	public void deleteDrama() {
		System.out.println("Delete Drama");
		System.out.println("Enter Drama id you want to delete: ");
		dId=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(dId==d[i].getId())
			{
			d[i]=null;	
			}
		}
		System.out.println("Drama deleted sucessfully!!");
		
	}

	@Override
	public void searchDrama() {
		
		System.out.println("Search drama");
		System.out.println("enter drama id you want to search: ");
		dId=sc.nextInt();
		int i;
		int flag=0;
		for(i= 0;i<count;i++)
		{
			if(dId==d[i].getId() && d[i]!=null)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Drama is available!!");
			System.out.println(d[i]);
		}
		else
		
			System.out.println("SORRY! Given drama is not present");
		
	}
}
