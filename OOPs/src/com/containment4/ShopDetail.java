package com.containment4;

public class ShopDetail {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemDetail i1=new ItemDetail(1,"coffee",500);
		ItemDetail i2=new ItemDetail(2,"floar",250);
		ItemDetail i3=new ItemDetail(3,"tea",350);
		ItemDetail i4=new ItemDetail(4,"sugar",780);
		ItemDetail i5=new ItemDetail(5,"chocolate",200);
		
		Supplier s1=new Supplier(11,"Mr.KOOK",i1);
		Supplier s2=new Supplier(11,"Mr.X",i2);
		Supplier s3=new Supplier(11,"Mr.ABC",i3);
		Supplier s4=new Supplier(11,"Mr.RAM",i1);
		Supplier s5=new Supplier(11,"Mr.KIM",i4);
		Supplier s6=new Supplier(11,"Mr.HONDA",i5);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		

	}

}
