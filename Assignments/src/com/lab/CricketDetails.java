package com.lab;
class Cricket
{
	private int playerId;
	private String name;
	private float strikeRate;
	private int run;
	boolean isBaller;
	Cricket()
	{
		
	}
	public Cricket(int playerId, String name, float strikeRate, int run, boolean isBaller) 
	{
		this.playerId =playerId;
		this.name =name;
		this.strikeRate =strikeRate;
		this.run =run;
		this.isBaller =isBaller;
	}
	public void setPlayerId(int playerId)
	{
		this.playerId=playerId;
	}
	public int getPlayerId() 
	{
		return playerId;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
	public void setStrikeRate(float strikeRate)
	{
		this.strikeRate=strikeRate;
	}
	public float getStrikeRate()
	{
		return strikeRate;
	}
	
	public void setRun(int run) 
	{
		this.run=run;
	}
	public int getRun() 
	{
		return run;
	}
	public void setBallaer(boolean isBaller)
	{
		this.isBaller=isBaller;
	}
	public boolean getIsBallaer()
	{
		return isBaller;
	}
	public String toString()
	{
		return "\n plaer id: "+playerId+"\n name: "+name+"\n strick Rate: "+strikeRate+"\n Runs :"+run+"\n Baller: "+isBaller;
	}	
	
	public void checkAward()
	{
		if(run<40000)
		{
			if(run<25000)
			{
				System.out.println("award: bronze");
			}
			else
			{
				System.out.println("award: silver");
			}
		}
		else if(run<60000)
		{
			System.out.println("award: gold");
		}
		else
		{
			System.out.println("award: platenium");
		}
		
		
	}
}
public class CricketDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c1=new Cricket();
		c1.setPlayerId(111);
		c1.setName("Virat");
		c1.setStrikeRate(55);
		c1.setRun(25112);
		c1.setBallaer(false);
		System.out.println(c1);
		c1.checkAward();
		System.out.println("---------------------------------------------------------");
		Cricket c2=new Cricket();
		c2.setPlayerId(7);
		c2.setName("MS Dhoni");
		c2.setStrikeRate(128);
		c2.setRun(30000);
		c2.setBallaer(false);
		System.out.println(c2);
		c2.checkAward();
		System.out.println("-------------------------------------------------------------");
		Cricket c3=new Cricket();
		c3.setPlayerId(6);
		c3.setName("jasprit bumrah");
		c3.setStrikeRate(46);
		c3.setRun(1100);
		c3.setBallaer(true);
		System.out.println(c3);
		c3.checkAward();
		System.out.println("--------------------------------------------------------------");
		Cricket c4=new Cricket(555,"sachine",60,80000,false);
		System.out.println(c4);
		c4.checkAward();
		System.out.println("--------------------------------------------------------------");
		Cricket c5=new Cricket(777,"yuvraj",52,50000,false);
		System.out.println(c5);
		c5.checkAward();
	}

}
