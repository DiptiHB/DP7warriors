package com.interfaceadvance;
interface bank
{
String name="RESERVE BANK OF INDIA";	
void show();
interface locker
{
	void showLocker();
}
}
class SBI implements bank,bank.locker
{
	int p;
	int t;
	int r;
	int lockerId;
	SBI()
	{
		
	}
    
	public SBI(int p, int t, int r, int lockerId) 
	{
		this.p = p;
		this.t = t;
		this.r = r;
		this.lockerId = lockerId;
	}

	public void show() 
	{
		System.out.println("locker id: "+lockerId);
		System.out.println("principal ammount: "+p);
		System.out.println("time: "+t);
		System.out.println("rate: "+r);
		System.out.println("SBI provide loan on education!");
		System.out.println("Ammount to return: "+((p*t*r)/100));	
	}
	
	

	@Override
	public void showLocker() {
		// TODO Auto-generated method stub
		System.out.println("locker id: "+lockerId);
	    System.out.println("you money is safe!");	
		
	}
	
}
public class LockerAccess {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		bank b;
//		b=new SBI();
		//b.show();
		bank.locker b1=new SBI(20000,2,5,112);
		bank b=(bank) b1;
	    b.show();
		b1.showLocker();
		
		
		

	}

}
