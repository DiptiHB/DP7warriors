package com.constructor;
import java.util.Scanner;
class collegeIn
{
int id;
String name;
String address;
String cName;


collegeIn()
{
	this.id=id;
	this.name=name;
	this.address=address;
	this.cName="Think Quotient";
}

public String getCName()
{
return cName;	
}
void show()
{
System.out.println("id: "+id);
System.out.println("name: "+name);
System.out.println("address: "+address);
System.out.println("college name: "+cName);
this.display();
	
}
void display()
{
System.out.println("your information is recorded..!");	
}

}

public class StudentClg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
		System.out.println("if you are Think Quotient student then enter 1 or 0 for other college name");
         n =sc.nextInt();
        
        if(n==1)
        {
        	collegeIn c1=new collegeIn();
        	System.out.println("enter id: ");
        	c1.id=sc.nextInt();
        	System.out.println("name: ");
        	c1.name=sc.next();
        	System.out.println("address: ");
        	c1.address=sc.next();
        	c1.show();
        }
        else if(n==0)
        {
        	collegeIn c2=new collegeIn();
        	System.out.println("enter id: ");
        	c2.id=sc.nextInt();
        	System.out.println("name: ");
        	c2.name=sc.next();
        	System.out.println("address: ");
        	c2.address=sc.next();
        	System.out.println("enter college name: ");
        	c2.cName=sc.next();
        	c2.getCName();
        	c2.show();
        }
        else
        {
        	System.out.println("sorry you have entered wrong number! enter you choice again!!");
        	break;
        }
		
		}while(true);
        
	}

}
