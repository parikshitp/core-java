package com.divergentsl.corejava.operators;

public class Operators4Types {

	public static void main(String[] args) {
		
		// since one of the operand is double the entire right hand side become double
		double aDouble = 3.4 + 12;
		
		System.out.println(aDouble);
		
		// if we try to store in integer we have to add casting
		int anInteger = (int)(3.4 + 12);
		System.out.println(anInteger);
		
		//implicit casting to long from integer
		long aLong = 1 + 3;
		System.out.println(aLong);
		
		// need explicit casting as one of the operand is long so entire right hand become long
		int anInt = (int)1l + 3;
		System.out.println(anInt);
		
		byte b =1;
		short s = 2;
		
		int sum = b + s;
		System.out.println(sum);
		
	}

}
