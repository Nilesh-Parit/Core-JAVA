package com.demo.interfaces;

//Functional Interface contains only one abstract functions
public interface MyInterface {
	int compare(int x,int y);
	
	default void f11() {
	  System.out.println("in f11");	
	}
	public static void m1() {
		System.out.println("in m1 static method");
	}

}
