package com.enumdemo;
class ConstantSeason
{
	public static final String  SUMMER="SUMMER";
	public static final String  AUTUMN="ATUMN";
	public static final String  WINTER="WINTER";
	public static final String  MONSOON="MONSOON";
	
}
public class EnumDemo1 {
	public enum Seasons{SUMMER,AUTUMN,WINTER,MONSOON};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seasons s1= Seasons.SUMMER;
		System.out.println(s1);
		Seasons s2=Seasons.SUMMER;
		
		if(s1.equals(s2))
			System.out.println("equals");
		if(s1==s2)
			System.out.println("equal");
		System.out.println("-------------------------------------");
		//iteration
		for(Seasons s:Seasons.values())
		{
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
		System.out.println(Seasons.valueOf("MONSOON"));
		
		System.out.println("-------------------------------------");
		System.out.println(Seasons.AUTUMN.ordinal());// gives index
		System.out.println("---------------------------------");
		Seasons s3=Seasons.WINTER;
		switch(s3)
		{
		case SUMMER:
			System.out.println("wear cotton cloths");
			break;
		case AUTUMN:
			System.out.println("nature is beautiful enjoy!");
			break;
		case WINTER:
			System.out.println("wear woolen cloths");
			break;
		}
	}

}
