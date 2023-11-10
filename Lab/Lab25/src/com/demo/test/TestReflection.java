package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.beans.MyClass;

public class TestReflection {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		Class cls=ob.getClass();
		Field[] flist=cls.getDeclaredFields();
		for(Field f:flist) {
			System.out.println("Name : "+f.getName()+"---Modifier : "+f.getModifiers());
		}
		//it will give access to private members
		flist[0].setAccessible(true);
		System.out.println(ob);
		try {
			flist[0].setInt(ob, 20);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(ob);
	}

}
