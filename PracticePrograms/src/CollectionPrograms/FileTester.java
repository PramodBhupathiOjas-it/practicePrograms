package CollectionPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class EmployeeFile {
	int empId;
	String empName;
	String designation;
	double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeFile(int empId, String empName, String designation, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeFile [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	

}

class EmployeeDetailsFile {
	List<EmployeeFile> employeeList = new ArrayList<EmployeeFile>();

	public List<EmployeeFile> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<EmployeeFile> employeeList) {
		this.employeeList = employeeList;
	}

	public EmployeeDetailsFile() {
		super();
	}

	public void getEmployeeFileList() {

		employeeList.forEach(System.out::println);

	}

	public void addEmployeeDetails(String f) throws IOException {

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		String[] splitLine = line.split(";");
		int empId = Integer.parseInt(splitLine[0]);
		String empName = splitLine[1];
		String designation = splitLine[2];
		int marks = Integer.parseInt(splitLine[3]);

		employeeList.add(new EmployeeFile(empId, empName, designation, marks));

	}

}

public class FileTester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileReader f = new FileReader("D:\\pramod.txt");
		EmployeeDetailsFile obj = new EmployeeDetailsFile();
		obj.addEmployeeDetails("D:\\pramod.txt");

		obj.getEmployeeFileList();

	}

}
