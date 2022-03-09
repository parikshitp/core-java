package com.divergentsl.corejava.inheritance;

import java.time.LocalDate;

public class Manager extends Employee {
	// Extra field in the sub-class, extending functionality
	private double bonus;

	public Manager(String name, double salary, LocalDate hireDate) {
		super(name, salary, hireDate);
		bonus = 0;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double getSalary() /* throws FileNotFoundException */ {
		// TODO Note we used "super" keyword to access the method as we cannot access
		// the private files directly
		return super.getSalary() + this.bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + "]";
	}
	
	
	
}
