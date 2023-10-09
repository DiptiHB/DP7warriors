package com.interfaceadvance;
interface locker
{
	public static final int money=200000;
    public static final String  jewllary="gold neckless and rings";
    public static final int lockerId=121;
   
    void lockerdetail();
    
    default void lockerInfo()
    {
      System.out.println("locker has double security lock.digital lock is available you can set passward!");
      System.out.println("current status of locker: ");
      System.out.println("Money: "+money);
      System.out.println("Jewllary :"+jewllary);
      System.out.println("Locker Id: "+lockerId);
      
      lockerOwn();
      lockSystem();
    }
    static void lockerOwn()
    {
    	System.out.println("Own by comapny(have copyrights and terms)");
    }
    private void lockSystem()
    {
    	System.out.println("Design by valencia");
    }
	
}
abstract class person implements locker
{
	String name;
	long income;
	person()
	{
		
	}
	person(String name,long income)
	{
		this.name=name;
		this.income=income;
	}
	abstract void Info();
	
}
class celebraty extends person 
{
	String ArtistType;
	
	celebraty()
	{
		
	}
	celebraty(String name,long income,String ArtistType )
	{
		super(name,income);
		this.ArtistType=ArtistType;
	}
	 void Info()
	{
		System.out.println("your assets are safe!! DONT WORRY!!:)");
		System.out.println("Owner name: "+name);
		System.out.println("Income: "+income);
		System.out.println("Artist: "+ArtistType);
	}
	public void lockerdetail() 
	{
	System.out.println("locker is setted in your wardrobe");	
	}
	
}

public class Lockeracess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p;
		p=new celebraty("Mr.Park Jimin",35000000,"Singer,Dancer,Model,Composer");
		p.Info();
		p.lockerdetail();
		p.lockerInfo();
		

	}

}
