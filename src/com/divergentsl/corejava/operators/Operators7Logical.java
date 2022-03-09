package com.divergentsl.corejava.operators;

public class Operators7Logical {

	public static void main(String[] args) {

		int x = 0 ; // int x = 1;
		int y = 0;
		if ((x == 0)  ||  (1 / x >= x + y ) )  // no division by 0 
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if(!(x == 0)) {
			System.out.println("called");
		}

	}

}
