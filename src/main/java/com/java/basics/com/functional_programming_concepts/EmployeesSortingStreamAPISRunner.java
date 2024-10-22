package com.java.basics.com.functional_programming_concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*class DescendingEmployee implements Comparator<EmployeesSortingStreamAPIS>{

	@Override
	public int compare(EmployeesSortingStreamAPIS employeeOne, EmployeesSortingStreamAPIS employeeTwo) {
		// TODO Auto-generated method stub
		return Integer.compare( employeeTwo.getEmployeeSalary(),employeeOne.getEmployeeSalary());
	}
	
}*/


public class EmployeesSortingStreamAPISRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeesSortingStreamAPIS>employeeList = List.of(
				new EmployeesSortingStreamAPIS(1,"Pranjal",3467),
				new EmployeesSortingStreamAPIS(2,"Rajesh",3468),
				new EmployeesSortingStreamAPIS(1,"Nishi",3469));
		
		//STREAM API SORTING-->ASCENDING ORDER
		
		ArrayList<EmployeesSortingStreamAPIS> employeeArrayList = new ArrayList<EmployeesSortingStreamAPIS>(employeeList);
		employeeArrayList.stream().sorted(
		(e1,e2)->e1.getEmployeeSalary()-e2.getEmployeeSalary())
		.collect(Collectors.toList()).forEach(e->System.out.println(e.getEmployeeName()));
		
		 System.out.println("The ascending order of the employee salries are ::"+ employeeArrayList);		
	}

}
