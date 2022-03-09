package com.divergentsl.corejava.multithreading;

public class Multithreading8Interrupt extends Thread {
	public void run() {
		try {
			
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted..." + e);
		}
	}

	public static void main(String args[]) {
		Multithreading8Interrupt thread = new Multithreading8Interrupt();
		thread.start();
		try {
			
			thread.interrupt();
		} catch (SecurityException e) { // this is because the checkAccess is called that can through this exception.
			System.out.println("Exception handled " + e);
		}
	}
}