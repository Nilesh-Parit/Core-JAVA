package com.demo.interfaces;

public interface Interface1
{
	void f11();
	default void f12()
	{
		System.out.println("Function f12 is called");	
	}
	
	static void f13()
	{
		System.out.println("Function f13 is called");
	}

}
