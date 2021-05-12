package com.ojas;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int empNo;
	String ename;
	double salary;
	public Employee(int empNo, String ename, double salary) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return  empNo + "" + ename + " " + salary ;
	}
	
}
class ListOperations{
	List<Employee> list;
	ListOperations(){
		list = new ArrayList<>();
	}
	void addEmployee(Employee e) {
		list.add(e);
		System.out.println("Added successfully");
	}
	void deleteEmployee(int num) {
		list.remove(--num);
		System.out.println("Deleted successfully");
	}
	void updateEmployee(int ind,Employee e) {
		list.set(--ind, e);
		System.out.println("updated successfully");
	}
	void listEmployees() {
		System.out.println("Employee info");
		for(Employee e : list) {
			System.out.println(e.toString());
		}
	}
	void menu() {
		String m = "Menu Driven Application\n";
	}
}
public class Demo {

}
