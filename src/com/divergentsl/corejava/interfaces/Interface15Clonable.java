package com.divergentsl.corejava.interfaces;

import java.util.Date;

public class Interface15Clonable {

	public static void main(String[] args) {
		
		Employee15 employee = new Employee15(2000.00, 23, new Date());
		System.out.println("First Employee:" + employee);
		
		try {
			
			Employee15 employee2 = employee.clone();
			System.out.println("Second Employee:" + employee2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

class Employee15 implements Cloneable {
	double salary;
	int age;
	Date hireDay;

	public Employee15() {

	}

	public Employee15(double salary, int age, Date hireDate) {
		this.salary = salary;
		this.age = age;
		this.hireDay = hireDate;
	}

	public Employee15 clone() throws CloneNotSupportedException {
		// call Object.clone()
		// this will do shallow clone 
		Employee15 cloned = (Employee15) super.clone();

		// IMPORTANT clone mutable fields
		// will do deep clone
		cloned.hireDay = (Date) hireDay.clone();
		return cloned;
	}

	@Override
	public String toString() {
		return this.salary + " " + this.age + " " + this.hireDay;
	}
}
