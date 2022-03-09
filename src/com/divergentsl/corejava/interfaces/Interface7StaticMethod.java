package com.divergentsl.corejava.interfaces;

public class Interface7StaticMethod {

	public static void main(String[] args) {
		DummyClass dummyClass = new DummyClass();

		dummyClass.printName("John", "Doe");
	}

}

interface DummyInterface {
	/*
	 * static methods are available in interface since Java 9
	 */
	static void concatAndPrintString(String first, String second) {
		System.out.println(first + " " + second);
	}

	void printName(String firstName, String lastName);
}

class DummyClass implements DummyInterface {

	@Override
	public void printName(String firstName, String lastName) {

		// the method can be called with reference of the interface and not class
		// reference
		// because the static methods are not inherited
		DummyInterface.concatAndPrintString(firstName, lastName);
	}

}