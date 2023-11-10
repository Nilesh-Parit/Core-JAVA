package com.demo.test;

public class TestLambada {

	public static void main(String[] args) {
			
			Sum<Integer> as=(x,y)->x+y;
			int result=as.sum(12,123);
			System.out.println(result);
	}

}
