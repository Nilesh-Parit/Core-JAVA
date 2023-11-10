package com.demo.thread;

import com.demo.beans.AddNo;

public class MutliThread extends Thread {
	AddNo an;
	public MutliThread(AddNo an2) {
		this.an=an2;
	}
	public void run()
	{
		an.add();
	}
}
