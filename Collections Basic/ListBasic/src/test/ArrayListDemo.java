package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
	
	 static List<Integer> al = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		 	al.add(50);
		 	al.add(40);
		 	al.add(30);
		 	al.add(20);
		 	al.add(100);
		 	al.add(78);
		 	
		
		System.out.println(al);
		
//		int sum=0;
//		for(int i=0;i<5;i++) {
//			sum = sum+al.get(i);
//		}
//		System.out.println(sum);
//		System.out.println("enetr the index for deletetion");
//		int num=sc.nextInt();
//		al.remove(num);
//		System.out.println(al);
//		
//		Iterator<Integer> itr =  al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			
//		}
//		
//		System.out.println("enetr the number for deletetion");
//		while(itr.hasNext()) {
//			int no = itr.next();
//			if(no==20)
//			{itr.remove();}
//		}
//		al.set(4, 55);
//		System.out.println(al);

      al.sort(null);
      System.out.println(al);
		
		
	}

}

