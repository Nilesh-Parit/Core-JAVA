package com.demo.Thread;

import com.demo.beans.MultipleTask;

public class multiSubThread extends Thread {
	MultipleTask mt;
	public multiSubThread(MultipleTask t) {
		super();
		this.mt = t;
	}
	
	public void run()
	{
		mt.substraction();
	}
}
