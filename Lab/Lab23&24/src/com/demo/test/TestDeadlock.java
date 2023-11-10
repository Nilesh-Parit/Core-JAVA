package com.demo.test;

import com.demo.Thread.MyThread;
import com.demo.Thread.MyThread2;
import com.demo.deadlock.Mytasks;

public class TestDeadlock {

	public static void main(String[] args) {
		Mytasks mt= new Mytasks();
		MyThread my= new MyThread(mt); 
		MyThread2 my2= new MyThread2(mt); 
		my.start();
		try {
			my.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		my2.start();
	}

}
