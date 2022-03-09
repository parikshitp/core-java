package com.divergentsl.corejava.interfaces;

public class Interface11InterfaceEvolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface IInterfaceEvolution {
	void methodA();

	
	//the below method will create issue to old classes 
	//void methodB();
	
	
	// if we add another method with default implementation then it will not create any
	// issue in existing classes implementing the interfaces
	
	default void methodB() {
		System.out.println("Method not supported!!!");
	}
	
}

class InterfaceEvolutionImpl implements IInterfaceEvolution {

	@Override
	public void methodA() {

	}

}