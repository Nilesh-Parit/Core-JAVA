package service;

import java.util.Set;

import bean.Employee;



public interface EmployeeService{

	void addEmployee(int x);

	Set<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	boolean updateSal(int id, int sal);

	Set<Employee> sortByName();

	Set<Employee> sortBySal();

	Employee[] findTopMost(int n);

}
