package com.innerdemo;
class Bank
{
	private String name="SBI BANK";
	String loc;
	String ifscCode;
	String aName;
	int accNo;
	{
		loc="pune";
		ifscCode="SBIHK45678";
	}
	void displayDetails()
	{
		System.out.println(name+" "+loc);
		System.out.println(ifscCode);
	}
	Bank()
	{
		
	}
	public Bank(String aName, int accNo) 
	{
		this.aName = aName;
		this.accNo = accNo;
	}
	class Locker
	{
		int locId;
		String pw;
		static float locRent=2000;
		Locker()
		{
			
		}
		public Locker(int locId, String pw) 
		{
			this.locId = locId;
			this.pw = pw;
		}
		void displyLocDetails()
		{
			 displayDetails();
			 System.out.println("this locker belongs to: "+aName+" with account no.:"+accNo);
			 System.out.println("locker id: "+locId);
			 System.out.println("rent to be paid: "+locRent);
			
		}
		
	}		
}

public class SimpleInnerClassDemo {
	public static void main(String args[])
	{
		Bank cust1=new Bank("dipti",101);
		cust1.displayDetails();
		Bank.Locker loc1= cust1.new Locker(111,"dHB123");
		loc1.displyLocDetails();
		
		Bank.Locker cust2=new Bank("Akansha",1234).new Locker(112,"AK456");
		cust2.displyLocDetails();
		
	}

}
