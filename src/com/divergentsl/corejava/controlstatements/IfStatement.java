package com.divergentsl.corejava.controlstatements;

public class IfStatement {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		
		if (i==j) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are different");
		} 
		
		
		int day = 1;
		
		if(day == 1) {
			System.out.println("Monday");
		} else if(day == 2) {
			System.out.println("Tuesday");
		} else if(day == 3) {
			System.out.println("Wednesday");
		} else if(day == 4) {
			System.out.println("Thursday");
		}else if(day == 5) {
			System.out.println("Friday");
		}else if(day == 6) {
			System.out.println("Saturday");
		}else if(day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Not a valid day");
		}
		
		
		
		
	}

}
