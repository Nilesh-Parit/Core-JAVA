package test;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo
{

	public static void main(String[] args)
	{
		Vector<Integer> lst = new Vector<>(20,5);
		
		lst.add(17);
		lst.add(33);
		lst.add(39);
		lst.add(62);
		lst.add(35);
		
		System.out.println(lst);
		
		lst.remove(3); // Remove by Index
		System.out.println(lst);
		
		lst.remove(new Integer(17)); // Remove By Value
		System.out.println(lst);
		
		System.out.println(lst.get(2));
		System.out.println("Capacity : "+lst.capacity());
		System.out.println("Size : "+lst.size());
		
		Enumeration e =lst.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		//display data 1.5
				for(int i=0;i<lst.size();i++) {
					System.out.println(lst.get(i));
				}
				//display data 1.7
				for(Integer num:lst) {
					System.out.println(num);
				}
		
		
	}

}
