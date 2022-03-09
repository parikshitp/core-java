package com.divergentsl.corejava.enums;

enum Size {
	SMALL, MEDIUM, LARGE, EXTRA_LARGE
}

/**
 * This class shows the basic of Enums
 * @author divergent
 * 
 */
 public class Enum1Basic {
	 
	 /**
	  * 
	  * @param args
	  */
	public static void main(String[] args) {
		// using the enum
		Size medium = Size.MEDIUM;
		
		// the rates have been changed on 22-02-2022 from 12 to 11
		int interestRate = 11;
		
		// we can assign null to it
		Size size = null;
		
		System.out.println(medium);
	}
}