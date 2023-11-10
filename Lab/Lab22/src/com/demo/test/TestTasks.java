package com.demo.test;

import com.demo.Thread.TaskThread;
import com.demo.beans.Task;

public class TestTasks {
	private static int a=7;
	public static void main(String[] args) {
		
		Task t=new Task();
		TaskThread th =new TaskThread(t,a);
		th.start();
		th.stop();
	
	}

}
