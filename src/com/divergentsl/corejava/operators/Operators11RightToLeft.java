package com.divergentsl.corejava.operators;

public class Operators11RightToLeft {

	public static void main(String[] args) {
		
		// Operators on the same level are processed from left to right
		
		System.out.println("Hello" + " World");
		
		
		
		System.out.println(1 + 2 + "Hello");
		System.out.println("Hello" + (1 + 2));
		
		//since * has more precedence over + so will give different result
		System.out.println("Hello" + 1 * 2);
	}

}
