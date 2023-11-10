package com.demo.test;
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 


public class OuterClass { 

	// Driver method 
	public static void main(String[] args) 
	{ 
		new OuterClass().startThreads(); 
	} 
	private void startThreads() 
	{ 
		ExecutorService taskList 
			= Executors.newFixedThreadPool(2); 

		taskList.execute(new InnerClass(1)); 
		taskList.execute(new InnerClass(2)); 
		taskList.execute(new InnerClass(3)); 
		taskList.execute(new InnerClass(4)); 
		taskList.execute(new InnerClass(5)); 
		taskList.shutdown(); 
	} 
	private void pause(double seconds) 
	{ 
		try { 
			Thread.sleep(Math.round(1000.0 * seconds)); 
		} 
		catch (InterruptedException e) { 
			e.printStackTrace(); 
		} 
	} 

	// Inner Class 
	public class InnerClass implements Runnable { 

		private int loopLimit; 
		InnerClass(int loopLimit) 
		{ 
			this.loopLimit = loopLimit; 
		} 

		@Override
		public void run() 
		{ 
			for (int i = 0; i < loopLimit; i++) { 
				System.out.println( 
					Thread.currentThread().getName() 
					+ " Counter: " + i); 
				pause(Math.random()); 
			} 
		} 
	} 
} 
