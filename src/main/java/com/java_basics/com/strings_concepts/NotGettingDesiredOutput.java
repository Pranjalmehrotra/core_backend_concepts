package com.java_basics.com.strings_concepts;

public class NotGettingDesiredOutput {

	
	// TLE ERROR
	public String reverseVowels(String s) {
		String vowelString = "aeiouAEIOU";
		char[] characterString = s.toCharArray();
		int low = 0;
		int high = s.length() - 1;
		while (low < high) {
			if (vowelString.indexOf(characterString[low]) == -1 && vowelString.indexOf(characterString[high]) != -1) {
				System.out.println("low value is non-vowel");
				low = low + 1;
			} else if (vowelString.indexOf(characterString[low]) != -1
					&& vowelString.indexOf(characterString[high]) == -1) {
				System.out.println("high value is non-vowel");
				high = high - 1;
			} else if (vowelString.indexOf(characterString[low]) == -1
					&& vowelString.indexOf(characterString[high]) == -1) {
				System.out.println("both values are non-vowel");
				low = low + 1;
				high = high - 1;
			} else if (vowelString.indexOf(characterString[low]) == 1
					&& vowelString.indexOf(characterString[high]) == 1) {
				System.out.println("both values are vowel");
				char temp = characterString[low];
				characterString[low] = characterString[high];
				characterString[high] = temp;
				low = low + 1;
				high = high - 1;
			}

		}
		String newString = new String(characterString);
		return newString;

	}
	// ----------------------------------------------------------------------------------------------------------------

	public static String removeOccurrences(String s, String part) {
		StringBuilder sbuilder = new StringBuilder(s);
		System.out.println(sbuilder.length());
		for (int i = 0; i < sbuilder.length(); i++) {
			int index = s.indexOf(part);
			String leftPart = s.substring(index);
			String rightPart = s.substring(part.length() + 1, s.length());
			s = leftPart + rightPart;

		}
		return s;

	}

}
