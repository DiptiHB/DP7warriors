package com.constructor;
class Item{
	private int itemId;
	private String itemName;
	private float price;
	
	Item(int itemId,String itemName,float price)
	{
		this.itemId=itemId;
		this.itemName=itemName;
		this.price=price;
		
	}
	
	public Item() {
		
	}

	public String toString()
	{
		return itemId+" "+itemName+" "+price;
	}
	public void setItemId(int itemId)
	  {
		  this.itemId=itemId;
	  }
		public int getItemId()
		{
			return itemId;
		}
		public void setItemName(String itemName)
		{
			this.itemName=itemName;
		}
		public String getItemName()
		{
			return itemName;
		}
		public void setPrice(float price)
		{
			this.price=price;
		}
		public float getPrice()
		{
			return price;
			
		}


}
public class GroceryShop {
	static void giveDiscount(Item it)
	{
		if(it.getPrice()>200)
		{
			float p=it.getPrice();
			p=(float) (p-(0.1*p));
			it.setPrice(p);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i=new Item(1,"sugar",250f);
		Item i2=new Item(2,"flour",280f);
		Item i3=new Item(3,"rice",150f);
		Item i4=new Item(4,"coffee",500f);
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
		Item i5=new Item();
		i5.setItemId(5);
		i5.setItemName("gloves");
		i5.setPrice(200);
        System.out.println(i5);
        
        System.out.println("----------------------------------------------------");
        
        giveDiscount(i);
        giveDiscount(i2);
        giveDiscount(i3);
        giveDiscount(i4);
        giveDiscount(i5);
        System.out.println("*****************price after discount********************");
        
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        
        
	}

}
