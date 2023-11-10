package com.demo.test;

import com.demo.Thread.TaskThread;
import com.demo.beans.Task;

public class MultiTask {
	static int a=20;
	public static void main(String[] args) {
		Task t=new Task();
		TaskThread th =new TaskThread(t,a);
		TaskThread th2 =new TaskThread(t,a);
		TaskThread th3=new TaskThread(t,a);
		th.start();
		th2.start();
		th3.start();
	}

}
