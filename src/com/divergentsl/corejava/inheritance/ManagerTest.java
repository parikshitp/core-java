package com.divergentsl.corejava.inheritance;

import java.io.IOException;
import java.time.LocalDate;

public class ManagerTest {

	public static void main(String[] args) throws IOException {
		// construct a Manager object

		var boss = new Manager("Carl Cracker", 80000, LocalDate.of(1987, 12, 15));
		boss.setBonus(5000);
		
		var staff = new Employee[3];
		
		// fill the staff array with Manager and Employee objects
		staff[0] = boss;
		// TODO : staff[0].setBonus(5000); // ERROR as Employee don't have the method

		staff[1] = new Employee("Harry Hacker", 50000, LocalDate.of(1989, 10, 1));
		staff[2] = new Employee("Tommy Tester", 40000, LocalDate.of(1990, 3, 15));
		
		// print out information about all Employee objects
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
		
		
	}
	
}



