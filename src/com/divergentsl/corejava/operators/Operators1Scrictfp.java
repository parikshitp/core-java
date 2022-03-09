package com.divergentsl.corejava.operators;

public class Operators1Scrictfp {

	public static void main(String[] args) {
		double x = 1.2;
		double y = 3.2;
		double z = 4.1;
		
		// The below can result in different results in different processors
		
		calculate(x,y,z);
		calculateWithoutStrictfp(x, y, z);
		
		
	}
	
	
	// scrictfp applied, the results will be same on every machine/processor
	public strictfp static void calculate(double x, double y, double z) {
		double w = x * y / z;
		System.out.println(w);
	}
	
	public  static void calculateWithoutStrictfp(double x, double y, double z) {
			double w = x * y / z;
			System.out.println(w);
		}
}
