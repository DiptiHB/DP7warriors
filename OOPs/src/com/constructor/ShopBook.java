package com.constructor;
class Book1
{
	
	private int bId;
	private String bName;
	private String bAurthor;
	private String bPublish;
	private float price;
	private char cat;
	
	Book1(int bId,String bName,String bAurthor,String bPublish,float price,char cat)
	{
		this.bId=bId;
		this.bName=bName;
		this.bAurthor=bAurthor;
		this.bPublish=bPublish;
		this.price=price;
		this.cat=cat;
		
	}
	public void setPrice(float price)
	 {
		 this.price=price;
	 }
	 public float getPrice()
	 {
		return price; 
	 }
	 public void setCat(char cat)
	 {
		 this.cat=cat;
	 }
	 public char getCat()
	 {
		return cat; 
	 }
	 public String toString()
	 {
		 return bId+"  "+bName+"  "+bAurthor+"  "+bPublish+" "+price+" "+" "+cat;
	 }
	
}

public class ShopBook {
	static void giveDiscount(Book1 b)
	{
		if(b.getCat()=='s')
		{
			System.out.println(" your category is student..you got 10% discount..!");
			float p=b.getPrice();
			p=(float) (p-(0.1*p));
			System.out.println("final price :"+p);
			b.setPrice(p);
			System.out.println(b);
		}
		else
		{
			
			float p=b.getPrice();
			System.out.println("your final price:"+p);
			b.setPrice(p);
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Book1 b1=new Book1(1,"Harry Potter and philosopher's stone","J.K Rowling","26/6/1997",500f,'s');
   Book1 b2=new Book1(2,"the secret seven","enid bliton","1949",250f,'s');
   Book1 b3=new Book1(3,"rich dad, poor dad","robert t.kiyosaki","1997",800f,'o');
   Book1 b4=new Book1(4,"secret","J.K rhonda byrne","2010",500f,'o');
  
//   System.out.println(b1);
//   System.out.println(b2);
//   System.out.println(b3);
//   System.out.println(b4);
   System.out.println("----------------------------------------------------------------");
   
   giveDiscount(b1);
   giveDiscount(b2);
   giveDiscount(b3);
   giveDiscount(b4);
   
      
	}

}
