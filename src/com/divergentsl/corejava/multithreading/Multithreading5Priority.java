package com.divergentsl.corejava.multithreading;

public class Multithreading5Priority {

	public static void main(String[] args) {
		
		
		// inspite of setting priority there is no guarantee which will execute first
		Thread thread = new Thread(new RunnableTest4("First"));
		thread.setPriority(Thread.MIN_PRIORITY);
		
		
		Thread thread2 = new Thread(new RunnableTest4("Second"));
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		thread.start();
		thread2.start();
		
		System.out.println("Main thread ends!!!");
	}

}

class RunnableTest4 implements Runnable {
	
	String name;
	
	public RunnableTest4(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 1_00_000 ; i++) {
			// do nothing
			try {
				Thread.sleep(100);
				System.out.println("Thread:" + name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}