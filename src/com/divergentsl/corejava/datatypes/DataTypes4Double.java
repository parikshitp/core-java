package com.divergentsl.corejava.datatypes;

public class DataTypes4Double {

	public static void main(String[] args) {
		
		double d = Double.NaN;
		
		
		
	//	if (Double.NaN == d) { // this will not work, All “not a number” values are considered distinct.
		
		if (Double.isNaN(d)) {// check whether x is "not a number"
			System.out.println("It's not a number!!");
		}
		
		// these below will just pring text
		System.out.println("Positive Infinity " + (3.4/0));
		System.out.println("Negative Infinity " + (-3.4/0));
		
		
		float f = (float)(0.0/0);
		System.out.println("Negative NaN " + f);
	}

}
