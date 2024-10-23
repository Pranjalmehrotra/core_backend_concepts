package com.javabasics.com_leetcode_questions;

import java.util.HashMap;
import java.util.Map;

public class LeetcodeQuestions {

	public static void merge2sortedArrays(int[] array1, int m, int[] array2, int n) {
		int k = 0;
		int[] mergedArray = { 0 };
		int low1 = array1[0];
		int low2 = array2[0];

		while (low1 < m && low2 < n) {
			if (array1[low1] < array2[low2]) {
				mergedArray[k] = array1[low1];
				low1++;
				k++;

			} else {

				mergedArray[k] = array2[low2];
				low2++;
				k++;

			}

		}
		System.out.println("The sorted merged array is ::" + mergedArray);

	}
//----------------------------------------------------------------------------------------------------------
	// Method 1::Left pending
	// T.C --->O(n)
	// S.C---->O(1)
	public static int[] moveZeroesOptimisedSolution(int[] moveZeroToEnd) {
		int low = 0;
		int high = 1;
		int n = moveZeroToEnd.length;
		while (low < n && high < n) {

			if (moveZeroToEnd[low] == 0 && moveZeroToEnd[high] != 0) {
				System.out.println("low == 0 and high != 0");

				int temp = moveZeroToEnd[low];
				moveZeroToEnd[low] = moveZeroToEnd[high];
				moveZeroToEnd[high] = temp;
				low = low + 1;
				high = high + 1;
				System.out.println(low);
				System.out.println(high);

			}

			if (moveZeroToEnd[low] == 0 && moveZeroToEnd[high] == 0) {
				System.out.println("low == 0 and high ==0");
				high = high + 1;
				System.out.println(low);
				System.out.println(high);
			} else {
				System.out.println("low != 0 and high !=0");
				low = low + 1;
				high = high + 1;
				System.out.println(low);
				System.out.println(high);
			}

		}

		// System.out.println("The zero moved to the end aree::" +
		// moveZeroToEnd.toString());
		return moveZeroToEnd;
	}

	// Method 2::
	// T.C --->O(n * n)
	// S.C---->O(1)

	public static int[] moveZerosBruttForce(int[] moveZeroToEnd) {

		for (int i = 0; i < moveZeroToEnd.length; i++) {

			for (int j = 0; j < i; j++) {

				if (moveZeroToEnd[i] == 0 && moveZeroToEnd[j] != 0) {

					int temp = moveZeroToEnd[i];
					moveZeroToEnd[i] = moveZeroToEnd[j];
					moveZeroToEnd[j] = temp;

				}
			}
		}
		return moveZeroToEnd;
	}

//--------------------------------------------------------------------------------------------------------
	//169. Majority Element--->Leetcode
	public static int majorityElement(int[] majorityElement) {
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		Integer maximumValue = 0;
		Integer lenArray = majorityElement.length;
		for (int num : majorityElement) {

			if (frequencyMap.get(num) == null) {

				frequencyMap.put(num, 1);
			}

			else {
				frequencyMap.put(num, frequencyMap.get(num) + 1);

			}
		}

		System.out.println("Frequency hash map is ::" + frequencyMap);

		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

			if (entry.getValue() > (lenArray / 2)) {
				maximumValue = entry.getKey();

			}

		}
		return maximumValue;

	}

}
