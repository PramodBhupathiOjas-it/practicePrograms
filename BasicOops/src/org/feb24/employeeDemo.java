package org.feb24;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee implements Serializable{
	int empNo;
	String ename;
	double salary;
	public Employee(int empNo, String ename, double salary) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}
	
	
	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}

public class employeeDemo {
	public static void main(String[] args) {
		List<Employee> li = new ArrayList<Employee>();
		li.add(new Employee(1,"pramod",38000.00));
		li.add(new Employee(2,"kirti",40000.00));
		li.add(new Employee(3,"fayaz",37000.00));
		li.add(new Employee(4,"shaik",36000.00));
		li.add(new Employee(5,"rahul",35000.00));
		li.add(new Employee(6,"dilip",34000.00));
		
		li.stream().distinct().sorted(Comparator.comparing(Employee::getEname)).forEach(System.out::println);
	}

	
	

}
