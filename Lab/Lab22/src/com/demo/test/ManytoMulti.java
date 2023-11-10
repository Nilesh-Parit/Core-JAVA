package com.demo.test;

import com.demo.Thread.TaskThread;
import com.demo.Thread.multiMultipleThread;
import com.demo.Thread.multiSubThread;
import com.demo.Thread.MultiThread;
import com.demo.beans.MultipleTask;
import com.demo.beans.Task;

public class ManytoMulti {
	private static int a;
	public static void main(String[] args) {
		MultipleTask t=new MultipleTask();
		MultiThread th=new MultiThread(t);
		
		multiSubThread th2=new multiSubThread(t);
		
		multiMultipleThread th3=new multiMultipleThread(t);
		th.start();
		try {
			th.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th2.start();
		try {
			th2.yield();
			th.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th3.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
