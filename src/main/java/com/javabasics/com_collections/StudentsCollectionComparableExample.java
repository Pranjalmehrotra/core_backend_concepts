package com.javabasics.com_collections;

public class StudentsCollectionComparableExample implements Comparable<StudentsCollectionComparableExample> {
	
	
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
	
	public StudentsCollectionComparableExample(String studentName, Integer studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	/*
	 * //Ascending order of their ids
	 * 
	 * @Override public int compareTo(StudentsCollectionComparableExample thatStudent) { 
	 * // TODO
	 * Auto-generated method stub 
	 * return this.studentId - thatStudent.studentId;
	 * }
	 */
	
	//Descending order of their ids
	/*
	 * @Override public int compareTo(StudentsCollectionComparableExample thatStudent) { // TODO Auto-generated method stub //return
	 * Integer.compare(thatStudent.studentId,this.studentId ); return
	 * thatStudent.studentId - this.studentId; }
	 */
	
	/*
	 * //Ascending order of the names of the students::
	 * 
	 * @Override public int compareTo(StudentsCollectionComparableExample thatStudent) {
	 * 
	 * return this.studentName.compareTo(thatStudent.studentName); }
	 */
	
	//Ascending order on the basis of the length of the student names
	@Override
	public int compareTo(StudentsCollectionComparableExample thatStudent) {
		
		return this.studentName.length() -  thatStudent.studentName.length();
	}
	
}
