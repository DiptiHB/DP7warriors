package com.arrylistlogical;

import java.util.ArrayList;
import java.util.Arrays;

//21.	WAP to convert collection into array
public class ConvertCollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("Blue");
		al.add("White");
		al.add("Yellow");
		al.add("Purpul");
		al.add("Grey");
		al.add("Black");
		
		String arr[]=new String[al.size()];
		al.toArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}

}
