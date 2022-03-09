package com.divergentsl.corejava.interfaces;

import java.util.Arrays;

public class Interface3IntMax {

	public static void main(String[] args) {

		Student[] students = new Student[] {new Student( 1, "Abhi", 23, 57.5), new Student( 2, "Boris", 22, 57.0)};
		
		Arrays.sort(students);
		
		printArray(students);
	}
	
	public static void printArray(Student[] students) {
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}
}

/**
 * Employee Class
 * @author parikshit
 *
 */
class Student implements Comparable<Student> {
	
	private String name;
	private int age;
	private Integer id;
	private Double weight;
	
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student(Integer id, String name, int age, Double weight) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.weight = weight;
	}

	@Override
	public int compareTo(Student student) {
		
		//the below line will give wrong result 
		//return (int) (this.getWeight() - student.getWeight());
		
		//better to use Double.compareTo
		return this.getWeight().compareTo(student.getWeight());
		
	//	return (this.getId() - student.getId()); //this.getId().compareTo(student.getId()); 
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.getId() + " " + this.getName() + " " + this.getAge() + " " + this.getWeight();
	}	
	
}