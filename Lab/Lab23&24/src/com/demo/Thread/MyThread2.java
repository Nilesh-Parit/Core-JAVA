package com.demo.Thread;

import com.demo.deadlock.Mytasks;

public class MyThread2 extends Thread {
	Mytasks mt;
	
	
	public MyThread2(Mytasks mt) {
		super();
		this.mt = mt;
	}

	
	public void run() {
		mt.addition();
		
	}


}
