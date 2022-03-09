package com.divergentsl.corejava.multithreading.executors;

public class ChildDto {
	
	private String name;
	
	private Integer count;
	
	private String childName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}
	
	@Override
	public String toString() {
		return name + " " + count + " " + childName;
	}

}
