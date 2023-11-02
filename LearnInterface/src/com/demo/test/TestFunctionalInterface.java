package com.demo.test;

import com.demo.interfaces.GenericInterface;
import com.demo.interfaces.MyInterface;

public class TestFunctionalInterface
{
	public static void main(String[] args)
	{
		
		//Lambda Function
		MyInterface ob=(x,y)->{return x>y?x:y;};
		System.out.println(ob.compare(12,15));
		
		GenericInterface<Integer> ob1=(x,y)->{return x>y?x:y;};
		GenericInterface<String> ob2=(x,y)->
		{int s=x.compareTo(y);
			if(s<0)
				return x;
			else 
				return y;
		};
		
		System.out.println(ob1.compare(12,15));
		System.out.println(ob2.compare("Nilesh ","Anshu"));
	}
}


