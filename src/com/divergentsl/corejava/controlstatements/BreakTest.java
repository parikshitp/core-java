package com.divergentsl.corejava.controlstatements;

public class BreakTest {

	public static void main(String[] args) {

		int i = 10;
		first: {
			second: {
				third: {
					System.out.println("first");
					if (i > 5)
						break second;
					System.out.println("second");
				}
				
			}
		    System.out.println("third");
		}

	}

}
