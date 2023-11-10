package com.demo.Thread;

import com.demo.beans.MultipleTask;

public class multiMultipleThread extends Thread{
	MultipleTask mt;
	public multiMultipleThread(MultipleTask t) {
		super();
		this.mt = t;
	}
	
	public void run()
	{
		mt.mutiply();
	}
}
