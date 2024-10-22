package com.java.basics.com.strings_concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringExamples {

//Ques 1 ---->Count Upper Cases letters in string.

	public static int countUpperLetters(String str) {

		// String is null or empty
		if (str == null || str.trim().length() == 0) {
			return 0;
		}
		int countUpperLettersInString = 0;
		for (int i = 0; i < str.length(); i = i + 1) {
			Character charUpper = str.charAt(i);
			if (Character.isUpperCase(charUpper)) {
				countUpperLettersInString = countUpperLettersInString + 1;
			}
		}
		return countUpperLettersInString;
	}

// ------------------------------------------------------------------------------------------------------------------------------

	// Ques2---->Anagram Checker

	public static boolean areAgnagram(String str1, String str2) {

		if (str1 == null || str2 == null) {

			return false;

		}

		if (str1.trim().length() != str2.trim().length()) {

			return false;
		}

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		char[] str1Character = str1.toCharArray();
		char[] str2Character = str2.toCharArray();

		Arrays.sort(str1Character);
		Arrays.sort(str2Character);

		System.out.println("Sorted Array of str 1 is ::" + str1Character);
		System.out.println("Sorted Array of str 2 is ::" + str2Character);

		boolean areArraysAnagram = Arrays.equals(str1Character, str2Character);

		/*
		 * if(areArraysAnagram == true){ return true; } return false;
		 */
		return areArraysAnagram;
	}

	// ---------------------------------------------------------------------------------------------------

	// Ques3 ---> WORD REVERSER

	// METHOD1 ----->USING THE STRING

	public static String reverseStringUsingString(String sentense) {

		if (sentense == null) {

			return "INVALID";
		}

		if (sentense.trim().length() == 0) {

			return "";
		}

		// List<StringBuilder>reverseStringArray = sentense.split(" ");

		String[] reverseStringArray = sentense.split(" ");
		// ["Hello" , "World"];

		String reverseString = "";

		for (String strBuilder : reverseStringArray) {
			if (!reverseString.isEmpty()) {

				reverseString = reverseString + " ";
			}
			// char[] charList = strBuilder.toCharArray();
			for (int i = strBuilder.length() - 1; i >= 0; i = i - 1) {

				char ch = strBuilder.charAt(i);
				reverseString = reverseString + ch;
				reverseString.trim();
			}
		}
		return reverseString;

	}

	// ---------------------------------------------------------------------------------------------------------------------
	// METHOD2---->USING STRINGBUILDER

	public static String reverseStringUsingStringBuilder(String sentense) {

		if (sentense == null) {

			return "INVALID";
		}

		if (sentense.trim().length() == 0) {

			return "";
		}

		// List<StringBuilder>reverseStringArray = sentense.split(" ");

		String[] reverseStringArray = sentense.split(" ");
		// ["Hello" , "World"];

		StringBuilder reverseString = new StringBuilder();

		for (String strBuilder : reverseStringArray) {

			StringBuilder reverserWord = new StringBuilder(strBuilder).reverse();
			System.out.println("Reverse word is ::" + reverserWord);
			reverseString.append(reverserWord).append(" ");

		}

		return reverseString.toString().trim();

	}

	// ------------------------------------------------------------------------------------------------------------

	// **************************************************************************************************

//Ques 5 --->151(Leetcode). Reverse Words in a String
	/*
	 * Example 1:
	 * 
	 * Input: s = "the sky is blue" Output: "blue is sky the" Example 2:
	 * 
	 * Input: s = "  hello world  " Output: "world hello" Explanation: Your reversed
	 * string should not contain leading or trailing spaces. Example 3:
	 * 
	 * Input: s = "a good   example" Output: "example good a"
	 */

	public static String reverseWords(String s) {
		if (s == null || s.trim().length() == 0) {
			return "";
		}
		s = s.trim();
		String[] splittedWords = s.split(" ");
		String reverseWord = "";

		for (String individualWord : splittedWords) {
			individualWord.trim();
			// System.out.println(individualWord);
			if (individualWord != "") {
				System.out.println(individualWord);
				reverseWord = individualWord + " " + reverseWord;
				reverseWord.trim();
			}

		}
		reverseWord = reverseWord.trim();

		return reverseWord;
	}

//************************************************************************************************
	// Ques 6 -->Leetcode -->344. Reverse String

	/*
	 * Example 1:
	 * 
	 * Input: s = ["h","e","l","l","o"] Output: ["o","l","l","e","h"] Example 2:
	 * 
	 * Input: s = ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
	 */

	public void reverseStringUsingTwoPointer(char[] s) {
		Integer low = 0;
		char temp = 'A';
		Integer high = s.length - 1;
		while (low < high) {
			temp = s[low];
			s[low] = s[high];
			s[high] = temp;
			low = low + 1;
			high = high - 1;
			// i = i+1;
		}

	}
	// **************************************************************************************************
//Ques 7 --->Leetcode -->345---->Reverse the vowels present in the string

	/*
	 * Example 1:
	 * 
	 * Input: s = "hello" Output: "holle" Example 2:
	 * 
	 * Input: s = "leetcode" Output: "leotcede"
	 */

	public static String reverseVowels(String s) {
		System.out.println("StringExamples.reverseVowels()");
		char[] stringArray = s.toCharArray();
		Integer low = 0;
		Integer high = stringArray.length - 1;
		String vowelString = "aeiouAEIOU";
		while (low < high) {

			System.out.println("Inside the while loop of reverseVowel");

			while (low < high && vowelString.indexOf(stringArray[low]) == -1) {
				System.out.println("Inside the -1 of low");
				low = low + 1;
			}
			while (low < high && vowelString.indexOf(stringArray[high]) == -1) {
				System.out.println("Inside the -1 of high");

				high = high - 1;
			}

			System.out.println("Inside the 1 of high and 1 of low");
			char temp = stringArray[low];
			stringArray[low] = stringArray[high];
			stringArray[high] = temp;
			low = low + 1;
			high = high - 1;

		}
		String reverseWord = new String(stringArray);

		return reverseWord;

	}

	// -------------------------------------------------------------------------------------------------------------------
	public static String reverseWords1(String s) {
		String[] splittedString = s.split(" ");
		System.out.println(splittedString.length);
		String reverseSentense = "";
		for (String word : splittedString) {
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i = i - 1) {
				reverseWord = reverseWord.trim() + word.charAt(i);
			}
			System.out.println(reverseWord);

			reverseSentense = reverseSentense + " " + reverseWord;
			System.out.println(reverseSentense);

		}

		return reverseSentense;
	}

	// -----------------------------------------------------------------------------------------------------------------------

	// Ques 8 --->125. Valid Palindrome

	/*
	 * Example 1:
	 * 
	 * Input: s = "A man, a plan, a canal: Panama" Output: true Explanation:
	 * "amanaplanacanalpanama" is a palindrome.
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: s = "race a car" Output: false Explanation: "raceacar" is not a
	 * palindrome.
	 */
//METHOD 1 ---->Using extra string
	public static boolean isPalindromeUsingNewString() {
		// String str = "A man, a plan, a canal: Panama";
		String str = "race a car";

		str = str.toLowerCase();
		// This is used in order to replace all the non-aplhanumeric characters with
		// empty value;
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String after removing all the non-aplhanumeric characters is ::" + str.toLowerCase());
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);

		}
		if (str.equals(reverseStr)) {
			return true;
		}
		return false;

	}

//METHOD2 --->Using inplace method

	public static boolean isPalindromeUsingTwoPointer() {
		// String str = "A man, a plan, a canal: Panama";
		String str = "race a car";

		str = str.toLowerCase();
		// This is used in order to replace all the non-aplhanumeric characters with
		// empty value;
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		Integer low = 0;
		Integer high = str.length() - 1;
		while (low < high) {

			if (str.charAt(low) != str.charAt(high)) {

				return false;
			}
			low = low + 1;
			high = high - 1;
		}
		return true;

	}
	// ----------------------------------------------------------------------------------------------------------->

//Ques 9 GFG --->Maximum Occuring Character
	/*
	 * Input: str = testsample Output: e Explanation: e is the character which is
	 * having the highest frequency.
	 */

	/*
	 * Input: str = output Output: t Explanation: t and u are the characters with
	 * the same frequency, but t is lexicographically smaller.
	 */

//	public static Map<Character,Integer> maximumOccuringCharacterString(String str) {
	public static char maximumOccuringCharacterString(String str) {

		Map<Character, Integer> frequencyHashMap = new HashMap<>();
		Map<Character, Integer> maximumFrequencyHashMap = new HashMap<>();

		Integer maxmiumCharFrequency = 0;
		char maximumFrequencyChar = 0;
		for (int i = 0; i < str.length(); i++) {
			char charWord = str.charAt(i);
			if (frequencyHashMap.get(charWord) == null) {
				frequencyHashMap.put(charWord, 1);
			} else {
				frequencyHashMap.put(charWord, frequencyHashMap.get(charWord) + 1);

			}
		}
		for (int i = 0; i < str.length(); i++) {
			char charWord = str.charAt(i);
			if (frequencyHashMap.get(charWord) >= maxmiumCharFrequency) {
				maximumFrequencyChar = charWord;
				maxmiumCharFrequency = frequencyHashMap.get(charWord);
				maximumFrequencyHashMap.put(maximumFrequencyChar, maxmiumCharFrequency);
				System.out.println("Frequency Hashmap in loop is ::" + maximumFrequencyHashMap);
				System.out.println("Frequency Maximum in loop is ::" + maxmiumCharFrequency);
			}
			// return maxmiumCharFrequency;
		}
		System.out.println("FreqencyHashMap is ::" + frequencyHashMap);
		System.out.println("Maximum-FreqencyHashMap is ::" + maximumFrequencyHashMap);

		if (maximumFrequencyHashMap.size() == 1) {
			return maximumFrequencyChar;
		} else {
			char smallestFreqencyChar = 'z';
			
			for (char keyChar : maximumFrequencyHashMap.keySet()) {

				if (keyChar < smallestFreqencyChar && 
					(maximumFrequencyHashMap.get(keyChar) == maxmiumCharFrequency)) {

					smallestFreqencyChar = keyChar;
				}

			}
			return smallestFreqencyChar;

		}

		// System.out.println("FreqencyHashMap is ::" + frequencyHashMap);
		// return maximumFrequencyChar;
	}

//-----------------------------------------------------------------------------------------------------------------

//LEFT----->To start from here

	public static void replaceSpaceWithSpecialCharcters() {
		String str = "My name is Pranjal Mehrotra";
		// char[] strChar = str.toCharArray();
		StringBuilder strBuilder = new StringBuilder(str);
		// str = str.replaceAll(" ", "@40");
		for (int i = 0; i < str.length(); i++) {
			// char characterStr = str.charAt(i);
			if (strBuilder.charAt(i) == ' ') {
				System.out.println("StringExamples.replaceSpaceWithSpecialCharcters()");
				/*
				 * strBuilder.append('@'); strBuilder.append('4'); strBuilder.append('0');
				 */
				// strBuilder.replace(i, i, "@40");
				str = str.replace(' ', '@');
				str = str.replace(' ', '4');
				str = str.replace(' ', '0');
			}

		}
		System.out.println("The updated string str is ::" + str);
		// System.out.println("The required string is ::" + str);
		/*
		 * String specialCharacter = "@40"; for(int i = 0; i < strChar.length; i++) {
		 * //System.out.println("Charcters are ::" + strChar[i]); if(strChar[i] == ' ')
		 * { System.out.println("Space is encountered");
		 * 
		 * }
		 * 
		 * 
		 * }
		 */

	}

	// ************************************************************************************************************

	/*
	 * Ques 10 --->1910. Remove All Occurrences of a Substring
	 * 
	 * Given two strings s and part, perform the following operation on s until all
	 * occurrences of the substring part are removed:
	 * 
	 * Find the leftmost occurrence of the substring part and remove it from s.
	 * Return s after removing all occurrences of part.
	 * 
	 * A substring is a contiguous sequence of characters in a string.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "daabcbaabcbc", part = "abc" Output: "dab" Explanation: The
	 * following operations are done: - s = "daabcbaabcbc", remove "abc" starting at
	 * index 2, so s = "dabaabcbc". - s = "dabaabcbc", remove "abc" starting at
	 * index 4, so s = "dababc". - s = "dababc", remove "abc" starting at index 3,
	 * so s = "dab". Now s has no occurrences of "abc". Example 2:
	 * 
	 * Input: s = "axxxxyyyyb", part = "xy" Output: "ab" Explanation: The following
	 * operations are done: - s = "axxxxyyyyb", remove "xy" starting at index 4 so s
	 * = "axxxyyyb". - s = "axxxyyyb", remove "xy" starting at index 3 so s =
	 * "axxyyb". - s = "axxyyb", remove "xy" starting at index 2 so s = "axyb". - s
	 * = "axyb", remove "xy" starting at index 1 so s = "ab". Now s has no
	 * occurrences of "xy".
	 */

	// It was giving the memory limited exceeded error----->because the right part
	// was not right.
	// I was starting from index = (partToBeRemoved.length()+1) but it should have
	// been partToBeRemoved.length() + index
	public static String removeAllOccurencesOfString(String inputString, String partToBeRemoved) {

		while (inputString.contains(partToBeRemoved)) {
			int index = inputString.indexOf(partToBeRemoved);
			System.out.println("The index is ::" + index);
			String leftString = inputString.substring(0, index);
			System.out.println("The left substring is ::" + leftString);
			String rightString = inputString.substring(partToBeRemoved.length() + index, inputString.length());
			System.out.println("The right substring is ::" + rightString);
			inputString = leftString + rightString;
			System.out.println("The string after removal of part is ::" + inputString);
		}
		return inputString;

	}
	// --------------------------------------------------------------------------------------------------

	// CHECKING WETHER THE STRING IS A HEXADECIMAL OR NOT::

	public static boolean isHexaDecimal(String str) {

		if (str == null || str.trim().length() == 0) {

			return false;
		}

		char[] chrList = str.toCharArray();

		for (char ch : chrList) {
			System.out.println("Is Charater a valid digit::" + ch + " " + Character.isDigit(ch));
			System.out.println("Is Charater a valid alphbet::" + ch + " " + isHexaDecimalCharacter(ch));

			if (!Character.isDigit(ch) && !isHexaDecimalCharacter(ch)) {
				return false;

			}

		}
		return true;
	}

	// ---------------------------------------------------------------------------------------------------------------------
	public static boolean isHexaDecimalCharacter(char ch) {

		if (ch >= 'A' && ch <= 'F' || ch >= 'a' || ch <= 'a') {

			return true;
		}
		return false;

	}

	// ---------------------------------------------------------------------------------------------------------------

}
