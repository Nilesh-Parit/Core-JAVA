package com.demo.test;

import com.demo.beans.AddNo;
import com.demo.thread.MutliThread;

public class test {

	public static void main(String[] args) {
		AddNo an=new AddNo();
		MutliThread mt=new MutliThread(an);
		mt.start();
		

	}

}
