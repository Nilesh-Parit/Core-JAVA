package com.demo.dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao 
{
	private static Set<Employee> s;
	
	static{
		s= new HashSet<>();
		s.add(new SalariedEmp(12,"anshu","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		s.add(new SalariedEmp(13,"nilesh","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		s.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		s.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		s.add(new ContractEmployee(15,"Anjali","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
	}
	@Override
	public void save(Employee e) {
		
		s.add(e);
	}

	@Override
	public Set<Employee> getAll() {
		return s;
	}

	@Override
	public Employee getById(int id) {
	     for(Employee e :s) {
	    	 if(e!=null) {
	    		 if(e.getPid()==id)
	    			 return e;
	    	 }
	    	 break;
	     }
	
		return null;
	}

	@Override
	public boolean removeById(int id) {
		for(Employee e :s) {
	    	 if(e!=null) {
	    		 if(e.getPid()==id)
	    			 return s.remove(e);
	    	 }
	    	 break;
	     }
		
		return false;
	}

	@Override
	public boolean updateSalById(int id, double sal) {
	  Employee e =	getById(id);
	  
	  if(e!=null) {
		  if(e instanceof SalariedEmp)
	            ((SalariedEmp)e).setSal(sal);
	            if(e instanceof ContractEmployee)
	            	((ContractEmployee)e).setCharges(sal);
	            return true;
	  }
	  
		return false;
	}

	@Override
	public Set<Employee> sortByName() {
		
	 TreeSet<Employee> t = new TreeSet<>();
	 for(Employee e:s) {
		 t.add(e);
	 }
		return null;
	}

	@Override
	public Set<Employee> sortBySal() {
		
		Comparator<Employee> mysal =(o1,o2)->{
			double s1=0,s2=0;
			if(o1 instanceof SalariedEmp) {
				s1 =((SalariedEmp)o1).getSal();
			}
			if(o1 instanceof ContractEmployee) {
				s1 =((ContractEmployee)o1).getCharges();
			}
			if(o2 instanceof SalariedEmp) {
				s2 =((SalariedEmp)o2).getSal();
			}
			if(o2 instanceof ContractEmployee) {
				s2 =((ContractEmployee)o2).getCharges();
			}
			return (int)(s1-s2);
		};
		
		TreeSet<Employee> ts=new TreeSet<>(mysal);
		for(Employee e:s) {
			ts.add(e);
		}
		return ts;
	}

	@Override
	public Employee[] findTopNEmployeesBySal(int n) {
		Set<Employee> ts=sortBySal();
		
		Employee[] arr = new Employee[n];
 		int count=0;
         for(Employee e:ts) {
        	arr[count]=e;
        	 count++;
        		 if(count==n)
        			 break;
         }
		return arr;
	}

}
