package com.divergentsl.corejava.interfaces;

import java.util.Date;

public class Interface9DefaultMethod {

	public static void main(String[] args) {
		DefaultMethodImpl defaultMethodImpl = new DefaultMethodImpl();
		defaultMethodImpl.concatAndPrintStringWithDate("Johe", "Doe");
	}
}

interface IDefaultMethod {

	default void concatAndPrintStringWithDate(String first, String second) {
		System.out.println(first + " " + second + " :> " + returnCurrentDate());
	}

	private static Date returnCurrentDate() {
		return new Date();
	}

	void printNameWithDate(String firstName, String lastName);

}

class DefaultMethodImpl implements IDefaultMethod {

	@Override
	public void printNameWithDate(String firstName, String lastName) {

		// below will call the default method in interface if the method is not
		// implemented in our class
		concatAndPrintStringWithDate(firstName, lastName);

	}

	@Override
	public void concatAndPrintStringWithDate(String first, String second) {

		//IDefaultMethod.super.concatAndPrintStringWithDate(first, second);

		System.out.println(first + " " + second + " : " + new Date());
	}

}