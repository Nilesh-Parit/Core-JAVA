package com.demo.Thread;

import com.demo.beans.MultipleTask;

public class MultiThread extends Thread{
	MultipleTask mt;
	public MultiThread(MultipleTask t) {
		super();
		this.mt = t;
	}
	
	public void run()
	{
		
		mt.addition();
		
	}
}
