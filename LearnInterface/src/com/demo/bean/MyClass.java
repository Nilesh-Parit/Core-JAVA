package com.demo.bean;

import com.demo.interfaces.Interface1;
import com.demo.interfaces.Interface2;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void f12()
	{
		System.out.println("In f12");	
	}

	@Override
	public void f22()
	{
		System.out.println("In f22");

	}
	@Override
	public void f11()
	{
		System.out.println("In f11");
	}
	 
	@Override
	public void f21()
	{
		Interface1.super.f12();
		Interface2.super.f21();
		System.out.println("extra code for default method");
	}

}
