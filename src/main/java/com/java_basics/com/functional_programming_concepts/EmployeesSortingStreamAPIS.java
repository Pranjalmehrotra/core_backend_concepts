package com.java_basics.com.functional_programming_concepts;


public class EmployeesSortingStreamAPIS implements Comparable<EmployeesSortingStreamAPIS>{
	
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	@Override
	public String toString() {
		return "EmployeesSortingStreamAPIS [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

	public EmployeesSortingStreamAPIS(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public int compareTo(EmployeesSortingStreamAPIS employeeThis) {
		// TODO Auto-generated method stub
		return Integer.compare(this.employeeSalary,employeeThis.employeeSalary);
	}

	

}
