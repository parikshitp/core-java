package com.divergentsl.corejava.interfaces;

import java.util.Arrays;

public class Interface1AsContract {

	public static void main(String[] args) {

		Employee[] employeeArray = new Employee[] { new Employee("Abhi", 23), new Employee("Boris", 21),
				new Employee("Chals", 21) };

		// sorting the employees based on their name
		// if we directly run it without implementing the java.lang.Comparable interface
		// in Employees then it will give error
		// java.lang.ClassCastException: class
		// com.divergentsl.corejava.interfac.Employee cannot be cast to class
		// java.lang.Comparable
		Arrays.sort(employeeArray);

		// Printing the array
		for (Employee employee : employeeArray)
			System.out.println(employee);
	}
}

class Employee implements Comparable<Employee> {

	String name;
	Integer age;

	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {

		return this.getAge().compareTo(o.getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return this.getName() + " " + this.getAge();
	}

}