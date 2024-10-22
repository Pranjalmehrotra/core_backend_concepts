package com.java.basics.com_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//1. Sort in Ascending Order on the basis of the ids of the Student

class AscendingStudentsId implements Comparator<StudentsCollectionComparatorExample> {

	@Override
	public int compare(StudentsCollectionComparatorExample o1, StudentsCollectionComparatorExample o2) {
		// TODO Auto-generated method stub
		return o1.getStudentId() - o2.getStudentId();
	}

}

//2. Sort in Descending Order on the basis of the ids of the Student

class DescendingStudentsId implements Comparator<StudentsCollectionComparatorExample> {

	@Override
	public int compare(StudentsCollectionComparatorExample o1, StudentsCollectionComparatorExample o2) {
		// TODO Auto-generated method stub
		return o2.getStudentId() - o1.getStudentId();
	}

}

//3.Ascending order of the names of the students::
class AscendingStudentsName implements Comparator<StudentsCollectionComparatorExample> {

	@Override
	public int compare(StudentsCollectionComparatorExample o1, StudentsCollectionComparatorExample o2) {
		// TODO Auto-generated method stub
		return o1.getStudentName().compareTo(o2.getStudentName());
	}

}

//4. Ascending order on the basis of the length of the student names

class AscendingStudentNameLength implements Comparator<StudentsCollectionComparatorExample> {

	@Override
	public int compare(StudentsCollectionComparatorExample o1, StudentsCollectionComparatorExample o2) {
		// TODO Auto-generated method stub
		return o1.getStudentName().length() - o2.getStudentName().length();
	}

}

public class StudentsCollectionComparatorExampleRunnner {

	public static void main(String[] args) {
		List<StudentsCollectionComparatorExample> students = List.of(
				new StudentsCollectionComparatorExample("Pranjal Mehrotra", 45),
				new StudentsCollectionComparatorExample("Suparsh Banerjee", 78),
				new StudentsCollectionComparatorExample("Syed hossain", 67));

		ArrayList<StudentsCollectionComparatorExample> studentsArrayList = new ArrayList<>(students);

		Collections.sort(studentsArrayList, new AscendingStudentsId());
		System.out.println("Students after sorted in accordance with the ascending order of their ids using the "
				+ "Collections sort method::");

		for (int i = 0; i < studentsArrayList.size(); i++) {
			System.out.println(String.format("%s id is %s . ", studentsArrayList.get(i).getStudentName(),
					studentsArrayList.get(i).getStudentId()));

		}

		System.out.println("******************************************************************");

		// Another way of using sorting with ArrayList:
		// studentsArrayList.sort(new AscendingStduent());
		/*
		 * System.out.
		 * println("Students after sorted in accordance with the ascending order of their ids using the "
		 * + "ArrayList sort method::" + studentsArrayList);
		 */
	}

}
