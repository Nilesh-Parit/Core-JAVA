

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ImplLinkedQueue {

	public static void main(String[] args) {
		System.out.println("Using Linked list");
		Queue<Integer> lst=new LinkedList<>();
		lst.add(10);
		lst.add(20);
		lst.add(50);
		lst.add(60);
		lst.add(70);
		lst.add(80);
		lst.add(90);
		lst.stream().forEach(System.out::println);
		System.out.println("poll"+lst.poll());
		System.out.println();


		System.out.println("Using Queue");
		Queue<Integer> lst1=new PriorityQueue<>();
		lst1.add(100);
		lst1.add(200);
		lst1.add(500);
		lst1.add(600);
		lst1.add(700);
		lst1.add(800);
		lst1.add(900);
		lst1.stream().forEach(System.out::println);

	}

}
