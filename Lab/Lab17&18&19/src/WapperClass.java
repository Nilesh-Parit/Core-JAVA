

import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 
import java.util.Iterator; 
import java.util.Scanner;



public class WapperClass {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>();
		System.out.println(lst);
		System.out.println("Adding elements in List");
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		System.out.println(lst);
		System.out.println();
		
		System.out.println("Removing elements From List");
		lst.remove(0);
		lst.remove(1);
		System.out.println(lst);
		System.out.println();
		
		System.out.println("Sorting elements of List");
		lst.add(80);
		lst.add(30);
		System.out.println("Before sort");
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println("After sort");
		System.out.println(lst);
		System.out.println();
		
		System.out.println("Search element from list");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element");
		int a=sc.nextInt();
		if (lst.contains(a))
			{
				System.out.println("Element found !");
			}
			else {
				System.out.println("Element not found !");
			}
		System.out.println("Iterate throw the list");
		Iterator<Integer> it=lst.iterator();
		
		System.out.println(it.next());
		
		
		}
	}


