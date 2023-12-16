package com.innerdemo;
class mall
{
	private String mallName="Pavallian";
	private String loc="pune";
	void doshopping()
	{
		class cart
		{
			String itemName;
			float price;
			static double bill=0;
			
			public void addItem(String itemName,float price)
			{
				this.itemName=itemName;
				this.price=price;
				
				System.out.println(this.itemName+" "+this.price);
				bill+=price;
			}
			public void display()
			{
				System.out.println("------------------------------------");
				System.out.println("toral bill: "+bill);
				System.out.println("Thank you for visiting "+mallName+" :"+loc);
			}
		}
		cart c1=new cart();
		c1.addItem("laptop", 80000);
		c1.addItem("mobile", 50000);
		c1.addItem("PenDrive", 500);
		c1.display();
	}
	
}
public class LocalInnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mall m1=new mall();
		m1.doshopping();
	}

}
