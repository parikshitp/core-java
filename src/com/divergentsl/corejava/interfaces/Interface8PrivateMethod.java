package com.divergentsl.corejava.interfaces;

import java.util.Date;

public class Interface8PrivateMethod {

	public static void main(String[] args) {
		PrivateMethodImpl privateMethodImpl = new PrivateMethodImpl();
		privateMethodImpl.printNameWithDate("John", "Doe");
	}

}



//-----------------------------------------------------


interface IPrivateMethod {

	// starting Java 9 we can have private static/non-static method in the interface
	// their use is limited to within interface being helper methods for the other
	// methods of the interface
	static void concatAndPrintStringWithDate(String first, String second) {
		System.out.println(first + " " + second + " : " + returnCurrentDate());
	}

	private static Date returnCurrentDate() {
		return new Date();
	} 
	
	void printNameWithDate(String firstName, String lastName);
}


//-----------------------------------------------------------------


class PrivateMethodImpl implements IPrivateMethod {

	@Override
	public void printNameWithDate(String firstName, String lastName) {
		
		// below line will not work
		//IPrivateMethod.returnCurrentDate();
		
		IPrivateMethod.concatAndPrintStringWithDate(firstName, lastName);
		
	}

}
