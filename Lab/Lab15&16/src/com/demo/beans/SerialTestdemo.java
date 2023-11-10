package com.demo.beans;

import java.io.Serializable;

public class SerialTestdemo implements Serializable {
	public int i;
	public String d;
	public SerialTestdemo(int i, String d) {
		super();
		this.i = i;
		this.d = d;
	}
	
}
