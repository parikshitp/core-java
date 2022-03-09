package com.divergentsl.corejava.clonable;

public class ClonableTest implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void clonableTest() {
		try {
			System.out.print("testing cloning:" + this.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
