package com.containment9;

public class MyDate {
	private int day;
	private String month;
	private int year;
	MyDate()
	{
		
	}
	MyDate(int day,String month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void setDay(int day)
	{
		this.day=day;
	}
	public int getDay()
	{
		return day;
	}
	public void setMonth(String month)
	{
		this.month=month;
	}
	public String getMonth()
	{
		return month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		return "\n day: "+day+"\n month: "+month+"\n year: "+year;
	}
	
	

}
