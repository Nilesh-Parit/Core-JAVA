package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao {
	
	static Map<Integer,Employee> m;
	static
	{
		m = new HashMap<>();
		m.put(16,new SalariedEmp(16,"Nilesh","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),6000,345));
 		m.put(15,new SalariedEmp(15,"Anshu","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4000,377));
 		m.put(13,new ContractEmployee(13,"Tejal","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,3000));
 		m.put(14,new ContractEmployee(14,"Rohan","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,4500));
 		m.put(17,new ContractEmployee(17,"Rutuja","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5500));
	}

	@Override
	public void save(Employee e) {
		if(!m.containsKey(e.getPid()))
		m.put(e.getPid(), e);
	}

	@Override
	public List<Employee> getAll() {
		
		List<Employee> l = new ArrayList<>();
		for(Employee e :m.values())
			l.add(e);
		return l;
	}

	@Override
	public Employee getById(int id) {

		return m.get(id);
	}

	@Override
	public boolean removeById(int id) {
	       if(m.containsKey(id))
	       {	m.remove(id);
	       return true;
	       }
		
		return false;
	}

	@Override
	public boolean updateSalById(int id, double sal)
	{
		Employee e =m.get(id);
			if(e instanceof SalariedEmp)
			{	((SalariedEmp)e).setSal(sal);
				return true;}
			else if(e instanceof ContractEmployee)
			{((ContractEmployee) e).setCharges(sal);
				return true;}
		return false;
	}

	@Override
	public List<Employee> sortBySal()
	{
		Comparator<Employee> c =(o1,o2)->
		{
			double sal1=0,sal2=0;
			if(o1 instanceof SalariedEmp)
				sal1=((SalariedEmp)o1).getSal();
			else
				sal1=((ContractEmployee)o1).getCharges();
			
			if(o2 instanceof SalariedEmp)
				sal2=((SalariedEmp)o2).getSal();
			else
				sal2=((ContractEmployee)o2).getCharges();
			
			return (int)(sal1-sal2);
		};
		
		List<Employee> elst=new ArrayList<>();
		for (Employee np:m.values())
		{
			elst.add(np);
		}
		elst.sort(c);
		return elst;
	}

	@Override
	public Employee[] findTopNEmployeesBySal(int n)
	{
		List<Employee> elst= sortBySal();
		Employee[] arr = new Employee[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=elst.get(i);
		}
		
		
		
		return arr;
	}

	@Override
	public List<Employee> findBySalary(double sal) {
		List<Employee> ls =new ArrayList<>();
		List<Employee> l = new ArrayList<>();
		for(Employee e :m.values())
			l.add(e);
		
		for(Employee e:l) {
			if(e instanceof SalariedEmp) {
				if(((SalariedEmp) e).getSal()>sal) {
					ls.add(e);
				}
			}else if (e instanceof ContractEmployee) {
				if(((ContractEmployee) e).getCharges()>sal)
					ls.add(e);
			}
		}
		return ls;
	}

	@Override
	public TreeMap<Integer, Employee> sortById() {
		TreeMap<Integer,Employee> tm=new TreeMap<>();
		Set<Integer> ks=m.keySet();  //{12,13,14,15,16,17}
		for(Integer ob:ks) {
			tm.put(ob, m.get(ob));
		}
		return tm;
	
	
	}

}
