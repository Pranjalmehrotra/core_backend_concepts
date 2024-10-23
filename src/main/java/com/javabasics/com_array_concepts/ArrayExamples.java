package com.javabasics.com_array_concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayExamples {

	// 1.Ques to find the second max and second min element in an array

	ArrayList<Integer> acceptedProposals(int arr[], int n) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		int max_element = 0;
		int second_max_element = 0;
		int min_element = Integer.MAX_VALUE;
		int second_min_element = Integer.MAX_VALUE;

		for (int number : arr) {

			if (number > max_element) {
				second_max_element = max_element;
				max_element = number;
			}

			if (max_element > number && second_max_element < number) {

				second_max_element = number;
			}

			if (min_element > number) {
				second_min_element = min_element;
				min_element = number;
			}

			if (min_element < number && second_min_element > number) {

				second_min_element = number;
			}
		}
		arrayList.add(second_max_element);
		arrayList.add(second_min_element);
		return arrayList;
	}

//--------------------------------------------------------------------------------------------------------------------------------------

	// Concept of anonymous arrays::

	// Programme to calculate the sum of the elements of the arrays

	public static void sumOfArrayUsingAnonymousArray() {
		
		
		//Anonymous Array creation
		System.out.println("The total sum of the elements present in the array is ::"
				+ sumElementsArray(new int[] { 10, 20, 30, 40, 50, 60 }));

	}

	public static int sumElementsArray(int[] arr) {
		int total = 0;
		for (int number : arr) {
			total += number;
		}

		return total;

	}
//-----------------------------------------------------------------------------------------------------------------------------
//Ques3--->Finding of the unique elements from the list::
	
	//Method 1 --->via object oriented concept(Set Datastructure)::
	
	public static Set<Integer>uniqueElementsListUsingSet(List<Integer>numList){
		Set<Integer> numSet = new HashSet<>(numList);
		return numSet;
	}
			

	// Method 2 ---->Using the streamAPI concept::

	public static List<Integer>uniqueElementsListUsingStreamAPIS(List<Integer>numList){
		List<Integer>numListUnique = numList.stream().distinct().collect(Collectors.toList());
		return numListUnique;

	}
			
	
	
	
	
}
