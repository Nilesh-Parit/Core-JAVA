package com.demo.deadlock;

public class Mytasks {
	
	
		public synchronized void addition()
		{
			int a=10;
			int b=20;
			int c=a+b;
			
			System.out.println("In Addition Function "+c);
		}
		
	}

