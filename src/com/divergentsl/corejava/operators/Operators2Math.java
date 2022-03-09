package com.divergentsl.corejava.operators;

public class Operators2Math {

	public static void main(String[] args) {

		
		// int anInteger = 1000000000 *3; System.out.println(anInteger);
		 

		//try {
		
			System.out.println(1000000000 * 3);
		
			int anInteger = Math.multiplyExact(1000000000, 3);
			System.out.println(anInteger);
			
			
			/*
			 * } catch (ArithmeticException e) {
			 * System.out.println("You cannot withdraw more than certain limit!"); }
			 */

	}

}
