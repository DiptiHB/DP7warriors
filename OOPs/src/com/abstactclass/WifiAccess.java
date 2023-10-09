package com.abstactclass;
abstract class wifi
{
	  protected String wifiName;
	  protected String wifiPassward;
	
	wifi()
	{
	System.out.println("this service provided by company for convinience!!");	
	}
	public wifi(String wifiName, String wifiPassward) 
	{
		this.wifiName = wifiName;
		this.wifiPassward =wifiPassward ;
	}
	abstract void ShowWifi();
}
class Employee extends wifi
{
	int EmpId;
	String empName;
	Employee()
	{
		super();
	}
	
	public Employee(String wifiName, String wifiPassward,int empId, String empName) 
	{
		super(wifiName,wifiPassward);
		EmpId = empId;
		this.empName = empName;
	}

	void ShowWifi()
	{
	System.out.println("employees can access wifi.");
	System.out.println("wifi name: "+wifiName);
	System.out.println("wifi passward: "+wifiPassward);
	}
}
class Admin extends wifi
{
	String AdminName;
	String dept;
	Admin()
	{
		super();
	}
	Admin(String wifiName, String wifiPassward,String AdminName,String dept)
	{
	  super(wifiName,wifiPassward);
	  this.AdminName=AdminName;
	  this.dept=dept;
	}
	void ShowWifi()
	{
	System.out.println("Admin can access wifi.");
	System.out.println("wifi name: "+wifiName);
	System.out.println("wifi passward: "+wifiPassward);
	}
}
public class WifiAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wifi w;
		w=new Employee("beGreatful","1234@kind",1,"Dipti");
		w.ShowWifi();
		System.out.println("------------------------------------");
		w=new Admin(w.wifiName,w.wifiPassward,"Aakansha","finance");
		w.ShowWifi();
		
	}

}
