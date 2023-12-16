package com.varargs;

public class VarargsDemo {
	static void varagsg(int ...n)
	{
		int sum=0;
		for(int i:n)
		{
			sum+=i;
		}
		System.out.println("sum: "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varagsg(2,3);
		varagsg(5,5,5);
		varagsg(3,2,9,5);
	}

}
//we can pass different args in method using varargs.[... ----> called as ellipsis]
