package com.demo.Thread;

import com.demo.deadlock.Mytasks;

public class MyThread extends Thread {
	Mytasks mt;
	
	
	public  MyThread  (Mytasks mt) {
		super();
		this.mt = mt;
	}

	
	public void run() {
		mt.addition();
		
	}


}
