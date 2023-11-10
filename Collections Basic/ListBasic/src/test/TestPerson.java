package test;

import java.util.ArrayList;
import java.util.List;

import bean.Person;

public class TestPerson {
	public static void main(String[] args) {
		List<Person> al =  new ArrayList<>();
		
		al.add(new Person(44,"Anshu","9876"));
		al.add(new Person(55,"nilesh","6543"));
		al.add(new Person(89,"anjal","7642"));
		
		System.out.println(al);
		
    int pos=al.indexOf(new Person(80,null,null));
    System.out.println(pos);
    al.remove(new Person(89,null,null));
    //al.remove(67);
    System.out.println(al);
		
	}

}
