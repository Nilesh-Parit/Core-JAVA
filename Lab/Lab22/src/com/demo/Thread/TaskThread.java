package com.demo.Thread;

import com.demo.beans.Task;

public class TaskThread extends Thread {
	private Task t;
	private int a;
	public TaskThread(Task t2,int a) {
		this.t=t2;
		this.a=a;
	}
	@Override
	public void run() {
		System.out.println(" You are in run method of Taskthread class (Runnnable)");
		t.taskImpl(a);
	}

}
