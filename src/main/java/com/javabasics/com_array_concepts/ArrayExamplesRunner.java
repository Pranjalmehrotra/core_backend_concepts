package com.javabasics.com_array_concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayExamplesRunner {

	public static void main(String[] args) {

		List<Integer> numList = List.of(23, 54, 67, 78, 67, 67);

		Set<Integer>numSet = ArrayExamples.uniqueElementsListUsingSet(numList);
		System.out.println("The value of the elements present in the list using set are::" + numSet);
		
		List<Integer>numListStreamAPI = ArrayExamples.uniqueElementsListUsingStreamAPIS(numList);
		
		System.out.println("The values of the elements present in the list suing stream apis are::" + numListStreamAPI);


		ArrayExamples.sumOfArrayUsingAnonymousArray();

		int[][] twoDArrayTwo = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20, 21 } };

		// TODO Auto-generated method stub

		// Method1 of creating the array:

		// 1.Array decalaration
		/*
		 * int[] methodOneArray = null;
		 * 
		 * //2.Array Creation methodOneArray = new int[5];
		 * 
		 * //3.Array Initialisation methodOneArray[0] = 20; methodOneArray[1] = 30;
		 * methodOneArray[2] = 40;
		 */
		// ---------------------------------------------------------------------------------------------------------------------

		// 2.Method 2 of creating the array in one line;

		int[] methodTwoArray = { 20, 30, 40 };
		for (int number : methodTwoArray) {
			System.out.println(number);

		}
		String[] stringMethod = { "Pranjal", "Rajesh", "Nishi" };
		Float[] floatArrayTwo = { 4.5f, 5.6f, 7.8f };

		int[] a = new int['a'];
		System.out.println("Value of array a as char is ::" + a);
		System.out.println("length of array a as char is ::" + a.length);

		// --------------------------------------------------------------------------------------------------------------------------------

		// CONCEPT OF 2-D ARRAYS::

		// Array Declaration
		int[][] twoDArray = null;

		// Array Construction
		twoDArray = new int[2][];
		twoDArray[0] = new int[4];
		twoDArray[1] = new int[3];

		// Array Initialisation

		twoDArray[0][0] = 10;
		twoDArray[0][1] = 20;
		twoDArray[0][2] = 30;
		twoDArray[0][3] = 40;

		twoDArray[1][0] = 50;
		twoDArray[1][1] = 60;
		twoDArray[1][2] = 70;

		System.out.println("The 2-d array is ::" + twoDArray);

		// Accessing the values from the 2-d array::

		for (int i = 0; i < twoDArray.length; i++) {

			for (int j = 0; j < twoDArray[i].length; j++) {

				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();

		}
//-----------------------------------------------------------------------------------------------------------------------------------------

//Taking input from the USER--->Scanner Class Concepts

		int size = 0;
		System.out.println("Enter thesize of the array::");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();

		// Array Declaration and Construction

		int[] arr = new int[size];

		System.out.println(arr);
		System.out.println("The size of the array is ::" + arr.length);
		System.out.println("Before initialisation");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " \t");
		}

		System.out.println();

		// Array Initialisation
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the array value");
			arr[i] = scan.nextInt();
		}

		System.out.println("ONE-D Array elements are ::");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " \t");
		}

//---------------------------------------------------------------------------------------------------------------------------------------

// Concept of forEach Loop in the 2-D Array

		// int[][] twoDArrayTwo =
		// {{1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15},{16,17,18,19,20,21}};

		// twoDarrayTwo has been declared and intialised just after the main method
		for (int[] oneDimAddress : twoDArrayTwo) {

			for (int number : oneDimAddress) {

				System.out.println(number + "\t");
			}
			System.out.println();

		}

	}
}
