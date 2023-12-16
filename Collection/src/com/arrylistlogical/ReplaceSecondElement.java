package com.arrylistlogical;

import java.util.ArrayList;

//23.	WAP to replace the second element of an ArrayList with the specified element
public class ReplaceSecondElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> color=new ArrayList<>();
		color.add("yellow");
		color.add("Red");
		color.add("Blue");
		color.add("White");
		color.add("Green");
		System.out.println("before: "+color);
		color.set(1, "Purpul");
		System.out.println("After: "+color);
		
		

	}

}
