package com.java_basics.com.leetcode_questions;

public class LeetcodeQuestionsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array1 = {1,2,3};
		int[] array2 = {2,5,6};
		int m = array1.length;
		int n = array2.length;
		int[] movZeroToEnd = {0,1,0,3,12};
		//int[] movZeroToEnd = {0,0,1,3,0};
		
		//int[] frequencyMap = {3,2,3};
		int[] frequencyMap = 	{2,2,1,1,1,2,2};

		//LeetcodeQuestions.merge2sortedArrays(array1, m, array2, n);
		/*
		 * int[]zeroMovedToEnd =
		 * LeetcodeQuestions.moveZeroesOptimisedSolution(movZeroToEnd);
		 * 
		 * for(int num:zeroMovedToEnd) { System.out.print(num + " "); }
		 */
		int[]zeroMovedToEndBruttForce = LeetcodeQuestions.moveZerosBruttForce(movZeroToEnd);
		
		for(int num:zeroMovedToEndBruttForce) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		int majorityElement = LeetcodeQuestions.majorityElement(frequencyMap);
		System.out.println("Majority element is ::" + majorityElement);
	}

}
