package com.varargs;

public class RuleofVarargs {
	// there can be only one varags in method
	static void varagsgRule(int n,String ...s)//varags should be last argument in method
	{
		System.out.println(n);
		for(String st:s)
		{
			System.out.println(st);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varagsgRule(555,"dipti","supriya","priya","sharu");

	}

}
