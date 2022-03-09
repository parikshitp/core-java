package com.divergentsl.corejava.interfaces;

import java.math.BigDecimal;

public class Interface4BigDecimal {

	public static void main(String[] args) {
		
		 BigDecimal firstNumber = new BigDecimal("1.0");
		 BigDecimal secondNumber = new BigDecimal("1.00");
		 
		 // we can decide that they are not equal because of different precision
		 System.out.println(firstNumber.equals(secondNumber));
		 // there is no obvious way to decide which is big and which is small
		 System.out.println(firstNumber.compareTo(secondNumber));
	}

}
