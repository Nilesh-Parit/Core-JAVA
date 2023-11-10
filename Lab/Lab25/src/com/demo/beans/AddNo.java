package com.demo.beans;

import java.util.ArrayList;
import java.util.List;

public class AddNo {
	public void add()
	{
		List<Integer> lst=new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.stream().forEach((a)->{System.out.println(a);});
	}
}
