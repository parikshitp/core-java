package com.divergentsl.corejava.multithreading;

public class Multithreading4StartMethod {

	public static void main(String[] args) {

		RunnableTest3 runnableTest3= new RunnableTest3();
		Thread runnableThread = new Thread(runnableTest3);
		// 1) Calling run method directly
		runnableThread.run();
		// 2) Calling start method
		runnableThread.start();
	}
}

class RunnableTest3 implements Runnable {
		@Override
		public void run() {
			System.out.println("run method called!!!");
		}
}