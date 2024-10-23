package com.javabasics.com_collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentsCollectionComparableExampleRunner {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<StudentsCollectionComparableExample> students = List.of(
				new StudentsCollectionComparableExample("Pranjal Mehrotra",45),
				new StudentsCollectionComparableExample("Suparsh Banerjee",78),
				new StudentsCollectionComparableExample("Syed hossain",67)
				);
		ArrayList<StudentsCollectionComparableExample>studentsArrayList = new ArrayList<>(students);
		//First way of sorting the generic classes
		//Now this issue is cooing because we have not implemented the Comparable interface in the StudentsCollectionComparableExample entity class.
		Collections.sort(studentsArrayList);
		
		//System.out.println("Students after sorted in accordance with the desceding order of their ids ::" + studentsArrayList);
		
		//System.out.println("Students after sorted in accordance with the asceding order of their names ::" + studentsArrayList);
		
		System.out.println("Students after sorted in accordance with the asceding order of their names of the length::");
		for(int i = 0; i< studentsArrayList.size();i++) {
			System.out.println(studentsArrayList.get(i).getStudentName());

		}
		System.out.println("Students after sorted in accordance with the asceding order of their names of the length::" + studentsArrayList);
		//Second Way of sorting the generic classes::
		
		

		
	}

}
