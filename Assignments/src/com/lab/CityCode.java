package com.lab;
import java.util.Scanner;
class City
{
	Scanner sc=new Scanner(System.in);
    void showCityCode()
   {
	 System.out.println("you can search city code for 1)pune,2)mumbai,3)nashik,4)amravati,5)thane");
     System.out.println("enter city name: ");
     String cName=sc.next();
     switch(cName)
     {
     case "pune":
    	 System.out.println("Pune: MH-12");
    	 break;
     case "mumbai":
    	 System.out.println("Mumbai: MH-01,MH-02,MH-03,MH-47");
    	 break; 
     case "nashik":
    	 System.out.println("pune: MH-15");
    	 break;
     case "amravati":
    	 System.out.println("pune: MH-27");
    	 break;
     case "thane":
    	 System.out.println("pune: MH-04,MH-05,MH-48");
    	 break;
      default:
    	 System.out.println("MH-00");
     }
	 
   }
	
}
public class CityCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c1=new City();
		c1.showCityCode();
	}

}
