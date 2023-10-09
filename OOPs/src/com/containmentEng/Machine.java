package com.containmentEng;

public class Machine {
	private String machineType;
	Engine e;
	Machine()
	{
		
	}
	Machine(String machineType,Engine e)
	{
		this.machineType=machineType;
		this.e=e;
		
	}
	public void setMachineType(String machineType)
	{
		this.machineType=machineType;
	}
	public String getMachineType()
	{
		return machineType;
	}
	public void setE(Engine e)
	{
		this.e=e;
	}
	public Engine getE()
	{
		return e;
	}
	public String toString()
	{
		return "\n Machine type : "+machineType+"\n engine details: "+e;
	}

}
