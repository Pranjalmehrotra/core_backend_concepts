package com.javabasics.com_array_concepts;
import java.util.ArrayList;

public class StudentVariableArgumentsExample {
	
	private String studentName;
	private ArrayList<Integer> studentMarks = new ArrayList<Integer>();
	//private ArrayList<Integer> studentMarks;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public ArrayList<Integer> getStudentMarks() {
		return studentMarks;
	}
	
	public void setStudentMarks(ArrayList<Integer> studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	public StudentVariableArgumentsExample(String studentName,int...studentMarksInput) {
		super();
		this.studentName = studentName;
        for(int mark : studentMarksInput) {
        	this.studentMarks.add(mark);
        }
	}
	
	
	

}
