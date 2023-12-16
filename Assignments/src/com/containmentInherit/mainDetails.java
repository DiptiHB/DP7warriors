package com.containmentInherit;

 class Rbuilding extends Building
{
	String ownerName;
	
	Rbuilding()
	 {
		 
	 }
	Rbuilding(String bName,String lCode,Flat f,String ownerName)
	 {
		super(bName,lCode,f);
		this.ownerName=ownerName;
	 }

	public String toString() {
		return "Royal building :\n ownerName=" + ownerName;
	}
	

}
public class mainDetails
{
	public static void main(String args[])
	{
		Flat f1=new Flat(111,5);
		Flat f2=new Flat(112,4);
		Flat f3=new Flat(113,6);
		Rbuilding r1=new Rbuilding("royal","BNT45213H",f1,"Mr.shah");
		
	}
}
