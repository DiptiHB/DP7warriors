package com.hashset;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Item>hs=new HashSet<>();
		hs.add(new Item(1,"Sugar",250));
		hs.add(new Item(2,"chocolate",50));
		hs.add(new Item(3,"coffee",350));
		hs.add(new Item(4,"ghee",550));
		hs.add(new Item(1,"Sugar",250));
		hs.add(new Item(5,"chips",150));
		for(Item i:hs)
		{
			System.out.println(i);
		}
		

	}

}
