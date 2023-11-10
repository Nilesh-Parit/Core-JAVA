package com.demo.test;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestHashMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2. delete employee by id\n 3. modify salary");
		System.out.println("4. Display all\n5. display by id\n 6. sort by salary\n7. sort by id");
		System.out.println("8. Display n topmost based on salary \n 9.Display all employees with sal > given salary\n10.exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. salaried\n2.contract\n 3.vendor");
			int ch=sc.nextInt();
			eservice.addnewEmployee(ch);
			break;
		case 2:
			System.out.println("enter id for delete");
			int id=sc.nextInt();
			boolean status=eservice.deleteById(id);
			if(status) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enter id for modify");
			id=sc.nextInt();
			System.out.println("enter salary");
			double sal=sc.nextDouble();
			status=eservice.modifySalById(id,sal);
			if(status) {
				System.out.println("modified successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 4:
			List<Employee> eset=eservice.displayAll();
			if(eset!=null) {
				eset.stream().forEach(System.out::println);
			}
			break;
		case 5:
			System.out.println("enter id for search");
			 id=sc.nextInt();
			Employee e=eservice.displayById(id);
			if(e!=null) {
				System.out.println(e);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 6:
			List<Employee> elst=eservice.sortBySalary();
			elst.stream().forEach(System.out::println);
			break;
		case 7:
			TreeMap<Integer,Employee> tm=eservice.sortById();
			Set<Integer> ks=tm.keySet();
			/*for(Integer k:ks) {
				System.out.println(tm.get(k));
			}*/
			ks.stream().forEach(ob->{System.out.println(tm.get(ob));});
			break;
		case 8:
			System.out.println("How many topmost employees based on salary you want?");
			int n=sc.nextInt();
			Employee[] earr=eservice.getTopNEmployees(n);
			Stream.of(earr).forEach(System.out::println);
			break;
		case 9:
			System.out.println("enter salary to search");
			sal=sc.nextDouble();
			List<Employee> elist=eservice.getBySalary(sal);
			if(elist!=null) {
				elist.stream().forEach(System.out::println);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 10:
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		default:
			System.out.println("wrong choice");
		}
		}while(choice!=10);
	}

}
