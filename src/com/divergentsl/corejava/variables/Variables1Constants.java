package com.divergentsl.corejava.variables;

public class Variables1Constants {

	//constant
	public static final double CM_PER_INCH = 2.54;

	// The "const" keyword is not used as of now in Java 
	//const double a = 0;	// TODO - remove comment
	
	public static void main(String[] args) {
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
		
		// local final variable
		final int count = 0;
		
		// the value cannot be changed
		//count = 8; // TODO - remove comment
	}
	

}
