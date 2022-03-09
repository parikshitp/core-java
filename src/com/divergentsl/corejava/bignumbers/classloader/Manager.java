package com.divergentsl.corejava.bignumbers.classloader;

import com.divergentsl.corejava.classes.Employee;

public class Manager extends Employee{

	public void display() {
		System.out.println("Protected:" + firstName + getFirstName());
	}
}
