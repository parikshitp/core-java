package com.divergentsl.corejava.inheritance;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Amit",30000);
		
		System.out.println(emp.getName());
		
		emp.setSalary(40000);
		
		System.out.println(emp.getSalary());
		
	}
	private double salary;
	private String name;
	private LocalDate hireDay;

	public Employee(String name, double salary/* , LocalDate hireDay */) {
		this.salary = salary;
		this.name = name;
		//this.hireDay = hireDay;

	}

	public double getSalary() /* throws IOException */ {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}

	@Override
	public boolean equals(Object otherObject) {
		// a quick test to see if the objects are identical
		if (this == otherObject)
			return true;
		// must return false if the explicit parameter is null
		if (otherObject == null)
			return false;
		// if the classes don't match, they can't be equal
		if (getClass() != otherObject.getClass())
			return false;
		// now we know otherObject is a non-null Employee
		Employee other = (Employee) otherObject;
		// test whether the fields have identical values
		return  Objects.equals(name, other.name)
				&& salary == other.salary
				&& Objects.equals(hireDay, other.hireDay);

	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary, hireDay);
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", hireDay=" + hireDay + "]";
	}

}
