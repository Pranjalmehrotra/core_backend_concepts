package com.java.basics.com.array_concepts;

import java.util.ArrayList;
import java.util.List;

public class StudentVariableArgumentsExampleRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int [] pranjalMarks = {30,59,70};
		int [] susparshMarks = {36,66,79};
		int [] rajeshMarks = {45,78,67};
		
		StudentVariableArgumentsExample pranjalVariable = new StudentVariableArgumentsExample("Pranjal",pranjalMarks);
		StudentVariableArgumentsExample susparshVariable = new StudentVariableArgumentsExample("Susparsh",susparshMarks);
		StudentVariableArgumentsExample rajeshVariable = new StudentVariableArgumentsExample("Rajesh",rajeshMarks);

		System.out.print(pranjalVariable.getStudentName());
		System.out.print(pranjalVariable.getStudentMarks());
		System.out.println();
		
		
		System.out.print(susparshVariable.getStudentName());
		System.out.print(susparshVariable.getStudentMarks());
		System.out.println();
		
		
		System.out.print(rajeshVariable.getStudentName());
		System.out.print(rajeshVariable.getStudentMarks());


	}

}
