package com.arrylistlogical;

import java.util.ArrayList;

//19.	WAP to match two collections
public class MatchArrayList {
	static void Match(ArrayList<Integer> list,ArrayList<Integer> list2)
	{
		if(list.size()==list2.size())
		{
			for(int i=0;i<list.size();i++)
			{
					if(list.get(i).equals(list2.get(i)))
					{
						System.out.println("Both list are same.");
						break;
						
					}
					else
					{
						System.out.println("lists are not equal");
					}
			}
		
		}
		else
		{
			System.out.println("size of lists are not equal");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		al.add(12);
		al.add(13);
		al.add(10);
		al.add(19);
		
		al2.add(12);
		al2.add(13);
		al2.add(10);
		al2.add(19);
		Match(al,al2);
		

	}

}
