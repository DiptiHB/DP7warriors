package com.vector;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<>(5);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println("--------------------------");
		v.add("java");
		v.add("c++");
		v.add("python");
		v.add("ruby");
		v.add("c");
		System.out.println(v);
		System.out.println("--------------------------");
		v.add("CSS");
		System.out.println(v.capacity());
		System.out.println(v.get(3));
		System.out.println(v.elementAt(4));
		System.out.println("--------------------------");
		System.out.println(v.remove(2));
		System.out.println(v.removeElement("c"));
		System.out.println(v);
		System.out.println("--------------------------");
		System.out.println(v.set(2, "Aws"));
		v.setElementAt("html", 0);
		System.out.println(v);
		
		
	}

}
