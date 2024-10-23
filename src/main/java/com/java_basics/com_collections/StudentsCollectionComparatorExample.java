package com.java_basics.com_collections;

public class StudentsCollectionComparatorExample {
	
	private String studentName;
	private Integer studentId;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	
	
	
	@Override
	public String toString() {
		return "StudentsCollectionComparableExample [studentName=" + studentName + ", studentId=" + studentId + "]";
	}
	
	public StudentsCollectionComparatorExample(String studentName, Integer studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}

}
