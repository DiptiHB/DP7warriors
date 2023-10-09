package com.statickeyword;


class Building
{
int flatNo;
int floor;
int noofMembers;
char wing;
static String buildingName="Krushnaprabha";
static
{
	System.out.println(buildingName);
	buildingName="Central avenue";
	
	System.out.println("-------------after changing name-------------- ");
	System.out.println(buildingName);
}
Building(int flatNo,int floor,int noofMembers,char wing)
{
	this.flatNo=flatNo;
	this.floor=floor;
	this.noofMembers=noofMembers;
	this.wing=wing;
	
}
static void playArea()
{
System.out.println("we have play area in our society.");	
}
static void swimmingPool()
{
System.out.println("we have swimming pool also.you can enjoy your time");	
}
void display()
{
	System.out.println("flat number: "+flatNo);
	System.out.println("floor: "+floor);
	System.out.println("no of Members: "+noofMembers);
	System.out.println("wing: "+wing);
	
}

}
public class Sociaty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building.playArea();
		Building.swimmingPool();
		System.out.println("-------------------------------------------------------------");
	    Building b1=new Building(101,1,12,'A');
		Building b2=new Building(202,2,14,'B');
		Building b3=new Building(303,3,16,'C');
		Building b4=new Building(404,4,8,'D');
		b1.display();
		b2.display();
		b3.display();
		b4.display();
	}

}
