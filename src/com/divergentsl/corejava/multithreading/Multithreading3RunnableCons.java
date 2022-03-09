package com.divergentsl.corejava.multithreading;

import java.util.concurrent.Executor;

public class Multithreading3RunnableCons {

	public static void main(String[] args) {
		
		RunnableTest2 runnableTest2= new RunnableTest2();
		Thread runnableThread = new Thread(runnableTest2);
		runnableThread.start();
		
		//1) We can use the same Runnable object in different threads
		Thread runnableThread2 = new Thread(runnableTest2);
		runnableThread2.start();
		
		//2) The runnable can be used at different places like Executors
		ThreadPerTaskExecutor executor = new ThreadPerTaskExecutor();
		executor.execute(runnableTest2);
		
	}

}

//3) The class can still extend other classes and implement other interfaces
class RunnableTest2 implements Runnable {
	String str;
	@Override
	public void run() {
		int i = 0;
		System.out.println("run method called!!!");
	}
}

class ThreadPerTaskExecutor implements Executor {
	public void execute(Runnable r) {
		new Thread(r).start();
	}
}
