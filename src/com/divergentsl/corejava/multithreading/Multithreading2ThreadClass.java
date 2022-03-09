package com.divergentsl.corejava.multithreading;

public class Multithreading2ThreadClass {

	public static void main(String[] args) {
		// Using the thread class
		ThreadTest threadTest = new ThreadTest();
		threadTest.start();
		
		//Using the runnable interface
		Thread runnableTest = new Thread(new RunnableTest());
		System.out.println("Thread Name:" + runnableTest.getName());
		runnableTest.start();
		
		//Check the parallel execution of the three threads in the debug mode
		System.out.println("Done!!");
		
	}

}

class ThreadTest extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Name:" + this.getName());
	}
}

class RunnableTest implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside Runnable run()");
	}
	
}
