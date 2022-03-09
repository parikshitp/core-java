package com.divergentsl.corejava.variables;

public class Variables4Scope {

	public static void main(String[] args) {
		int a = 20;
		
		if (a > 10) {
			int b = 20;
			System.out.println("\'a\' inside block :" + a);
		}
		//System.out.println("\'b\' outside block :" + b); // not accessible
		System.out.println("a outside block :" + a);
	}
}
