package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.beans.SerialTestdemo;

public class SerializableTest {

	public static void main(String[] args) {
		//Serialization
		try {
			SerialTestdemo st=new SerialTestdemo(10,"hello");
			FileOutputStream fos 
			= new FileOutputStream("test.txt");
			try {
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(st);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Deserialization
		try {
			FileInputStream fis=new FileInputStream("test.txt");
			try {
				ObjectInputStream ois=new ObjectInputStream(fis);
				try {
					SerialTestdemo b=(SerialTestdemo) ois.readObject();
					System.out.println(b.i+b.d);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
