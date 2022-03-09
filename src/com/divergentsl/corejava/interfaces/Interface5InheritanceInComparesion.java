package com.divergentsl.corejava.interfaces;

public interface Interface5InheritanceInComparesion {

}

//Since Manager extends Employee, it implements
//Comparable<Employee> and not Comparable<Manager>
class Manager extends Employee /* implements Comparable<Employee> */ {

	public Manager(String name, Integer age) {
		super(name, age);
	}

	/*
	 * That violates the “antisymmetry” rule. If x is an Employee and y is a
	 * Manager, then the call x.compareTo(y) doesn’t throw an exception—it simply
	 * compares x and y as employees. But the reverse, y.compareTo(x), throws a
	 * ClassCastException
	 */

	@Override
	public int compareTo(Employee other) {

		/*
		 * Case 1 
		 * If subclasses have different notions of comparison, then you should
		 * outlaw comparison of objects that belong to different classes. Each compareTo
		 * method should start out with the test
		 * 
		 */
		if (getClass() != other.getClass())
			throw new ClassCastException();

		/*
		 * Case 2 
		 * If there is a common algorithm for comparing subclass objects, simply
		 * provide a single compareTo method in the superclass and declare it as final
		 */

		/*
		 * Case 3 
		 * If you need to establish a pecking order, supply a method such as "rank"
		 * in the Employee class. Have each subclass override rank, and implement a
		 * single compareTo method that takes the rank values into account.
		 * 
		 */

		Manager otherManager = (Manager) other; // NO

		return 0; // just a dummy implementation

	}

}