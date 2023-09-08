package com.constructor;
 class Theater
 {
	 private int mId;
	 private String name;
	 private Float rating;
	 private int price;
 
 Theater(int mId,String name,Float rating,int price)
 { 
	 this.mId=mId;
	 this.name=name;
	 this.rating=rating;
	 this.price=price;
 }
 public void setRating(float rating)
 {
	 this.rating=rating;
 }
 public float getRating()
 {
	return rating; 
 }
 public String toString()
 {
	 return mId+"  "+name+"  "+rating+"  "+price;
 }
 }
public class Movie {
	static void checkRating(Theater t)
	{
		if(t.getRating()>=7)
		{
			System.out.println(t);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater t1=new Theater(1,"Gadar2",8.5f,500);
		Theater t2=new Theater(2,"oMG2",7.3f,900);
		Theater t3=new Theater(3,"rocky and rani",6.5f,300);
		Theater t4=new Theater(4,"dearmgirl2",6.0f,350);
		Theater t5=new Theater(5,"adipurush",0.0f,800);
		Theater t6=new Theater(6,"RRR",9.2f,800);
		
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
		
		System.out.println("--------------after checking rating----------------------------------------------");
		System.out.println("our suggession is :");
		checkRating(t1);
		checkRating(t2);
		checkRating(t3);
		checkRating(t4);
		checkRating(t5);
		checkRating(t6);
		
		
     
	}

}
