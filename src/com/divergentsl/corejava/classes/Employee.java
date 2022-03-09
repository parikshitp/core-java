package com.divergentsl.corejava.classes;

public class Employee {
	protected String firstName;
	String lastName;
	Integer age;

	public Employee() {
	}

	public Employee(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	protected String getFirstName() {
		return firstName;
	}

}
