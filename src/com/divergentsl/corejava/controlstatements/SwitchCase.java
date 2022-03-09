package com.divergentsl.corejava.controlstatements;

enum WeekDays {MONDAY, TUESDAY}

public class SwitchCase {

	public static void main(String[] args) {

		WeekDays day = WeekDays.MONDAY;
		
		switch (day) {
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		/*
		 * case 3: System.out.println("Wednesday"); break; case 4:
		 * System.out.println("Thursday"); break; case 5: System.out.println("Friday");
		 * break; case 6: System.out.println("Saturday"); break; case 7:
		 * System.out.println("Sunday"); break;
		 */
			default:
				System.out.println("Not a valid value");
		}
		
		
		int[] array = {1,2,3,4,5};
		
		for(int x : array) {
			System.out.println(x);
		}
	}

}
