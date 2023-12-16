package com.hashset;

import java.util.*;

//create a map in which coursename is a key and number of students in that course is value 
//<"java" , 8>
//<"angular" , 10>

public class HashSettoHashMap {
	public static void convert(HashSet<Student>hs)
	{
		HashMap<String,Integer>map=new HashMap<>();
		int cnt;
		Iterator <Student>itr=hs.iterator();
				while(itr.hasNext())
				{
					Student stud=itr.next();
					if(map.containsKey(stud.getCourse().getcName()))
					{
						cnt=map.get(stud.getCourse().getcName());
						cnt++;
						map.put(stud.getCourse().getcName(),cnt);
					}
					else
					{
						cnt=1;
						map.put(stud.getCourse().getcName(), cnt);
						
					}
				}
				for(Map.Entry<String, Integer>e:map.entrySet())
				{
					System.out.println(e.getKey()+"-->"+e.getValue());
				}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student>hs=new HashSet<>();
		hs.add(new Student(1,"Dipti",89,50000,new Course(111,"java",50000)));
		hs.add(new Student(2,"Prisha",31,45000,new Course(112,".net",45000)));
		hs.add(new Student(3,"Sakshima",65,25000,new Course(113,"python",30000)));
		hs.add(new Student(4,"Himali",33,45000,new Course(111,"java",50000)));
		hs.add(new Student(5,"Toshada",30,25000,new Course(114,"c++",25000)));
		hs.add(new Student(6,"Dev",25,50000,new Course(111,"java",50000)));
		
//		for(Student s:hs)
//		{
//			System.out.println(s);
//		}
		convert(hs);
	}

}
