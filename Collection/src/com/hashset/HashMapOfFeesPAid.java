package com.hashset;

import java.util.*;

public class HashMapOfFeesPAid {
	public static void checkFeesPaid(HashSet<Student>set)
	{
		HashMap<String,Integer>feesPaid=new HashMap<>();
		
		int cnt;
		int cnt1;
		Iterator<Student> itr=set.iterator();
		while(itr.hasNext())
		{
			Student stud= itr.next();
			if(stud.getFeesPaid()==stud.getCourse().getFees())
			{
				if(feesPaid.containsKey("feespaid"))
				{
				cnt=feesPaid.get("Feespaid");
				cnt++;
				//feesPaid.put("fees paid",cnt);
				}
				else
					cnt=1;
					feesPaid.put("feesPaid", 1);
			}
			else
			{
				if(feesPaid.containsKey("feesnotpaid"))
				{
				cnt=feesPaid.get("feesnotpaid");
				cnt++;
				feesPaid.put("feesnotpaid", cnt);
				}
				else
					cnt=1;
					feesPaid.put("fessnotpaid", 1);
			}
		}
		for(Map.Entry<String, Integer>e:feesPaid.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student>hs=new HashSet<>();
		hs.add(new Student(1,"Dipti",89,50000,new Course(111,"java",50000)));
		hs.add(new Student(4,"Himali",33,45000,new Course(111,"java",50000)));
		checkFeesPaid(hs);
		

	}

}
