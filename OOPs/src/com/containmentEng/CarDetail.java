package com.containmentEng;

public class CarDetail {
	private int modelNo;
	private String carName;
	Machine m;
	CarDetail()
	{
		
	}
   CarDetail(int modelNo, String carName, Machine m)
   {
	    this.modelNo=modelNo;
		this.carName=carName;
		this.m=m;
	}

public void setModelNo(int modelNo)
{
	this.modelNo = modelNo;
}
public int getModelNo() 
{
	return modelNo;
}
public void setCarName(String carName) 
{
	this.carName = carName;
}
public String getCarName()
{
	return carName;
}
public void setM(Machine m)
{
	this.m = m;
}
public Machine getM() 
{
	return m;
}
  public String toString()
  {
	  return "\n model id: "+modelNo+"\n car name: "+carName+"\n machine detail: "+m;
  }

}
