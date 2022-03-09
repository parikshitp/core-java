package com.divergentsl.corejava.interfaces;

public class Interface12DefaultMethodConflict {

	public static void main(String[] args) {
		SomeStudent someStudent = new SomeStudent();
		System.out.println(someStudent.getName());
	}

}

interface Person {

	default String getName() {
		return "P";
	};
}

interface Named {

	//String getName();
	
	default String getName() { return "N"; }
	 
}


/*
 * IMPORTANT If at least one interface provides an implementation, the compiler
 * reports an error, and the programmer must resolve the ambiguity
 */
class SomeStudent /* extends SomeOtherStudent */ implements Person, Named {

	// The conflict needs to be resolved through implementing the method
	
    @Override public String getName() { return Person.super.getName() ; }
	 
	
}

// super class with the same method
class SomeOtherStudent {
	public String getName() {
		return "SP";
	}
}
