package com.divergentsl.corejava.bignumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {

	public static void main(String[] args) {

		// for small numbers
		BigInteger aBigInteger = BigInteger.valueOf(100);
		// For longer numbers, use a constructor with a string parameter:
		BigInteger reallyBigInteger = new BigInteger("2222322446294204455297398934619099672066669390");

		BigNumbers.bigNumberOperations(aBigInteger, reallyBigInteger);
	
	}

	public static void bigNumberOperations(BigInteger aBigInteger, BigInteger reallyBigInteger) {

		// Arithmetic operations through methods
		BigInteger addReuslt = aBigInteger.add(reallyBigInteger); // c = a + b
		BigInteger multiplyResult = aBigInteger.multiply(reallyBigInteger); // d = c * a

		System.out.printf("Addition       : %d%n", addReuslt);
		System.out.printf("Multiplication : %d%n", multiplyResult);
	}

}
