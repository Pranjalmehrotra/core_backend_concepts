package com.java_basics.com.strings_concepts;


public class StringExamplesRunner {

	public static void main(String[] args) {
		String string = "Hello WORLd"; 
	
		// TODO Auto-generated method stub
		
		/*
		 * String string = "Hello WORLd"; 
		 * string = string.toLowerCase(); string =
		 * string.replaceAll("[^a-zA-Z0-9]","");
		 * System.out.println("Lower case string is ::" + string);
		 */
		
		//Count Upper Cases letters in string
		Integer totalUpperCountInString = StringExamples.countUpperLetters(string);
		System.out.println("The total upper count characters in str are ::" + totalUpperCountInString);
		
		boolean anagramChecker = StringExamples.areAgnagram("Listen", "Silent");
		System.out.println("The strings are anagram ::" + anagramChecker);
		
		//String reverseString = StringExamples.reverseStringUsingString("Hello World is a captain");
		String reverseString = StringExamples.reverseStringUsingString("a good   example");
		System.out.println("The reverse String is  ::" + reverseString);
		
		String reverseStringStringBuilder = StringExamples.reverseStringUsingStringBuilder("Hello World is a captain");
		System.out.println("The reverse String using stringbuilder is  ::" + reverseStringStringBuilder);
		
		//boolean isValidHexaDecimal = StringExamples.isHexaDecimal("123f" );
		//System.out.println("The string is valid hexademial ::" + isValidHexaDecimal);
		
		String reverseWordWithVowel = StringExamples.reverseVowels("a.b,.");
		System.out.println("The reverse string with vowels is ::" + reverseWordWithVowel);
		
		String reverseWords1 = StringExamples.reverseWords1("hehhhhhhe");
		System.out.println("The reverse string with vowels is ::" + reverseWords1);
		
		boolean isPlaindromeUsingString = StringExamples.isPalindromeUsingNewString();
		System.out.println("The string is plaindrome using new string::"+ isPlaindromeUsingString);
		
		boolean isPlaindromeUsingTwoPointer = StringExamples.isPalindromeUsingTwoPointer();
		System.out.println("The string is plaindrome using two-pointer::"+ isPlaindromeUsingTwoPointer);
		
		//Map<Character,Integer> frequencyHashMap = StringExamples.maximumOccuringCharacterString("testsample");
		char frequencyHashMap = StringExamples.maximumOccuringCharacterString("orqxvbq");

		System.out.println("The maximum frequency is ::"+ frequencyHashMap);
		
		StringExamples.replaceSpaceWithSpecialCharcters();

		StringExamples.removeAllOccurencesOfString("daabcbaabcbc", "abc");


	}

}
