package com.javabasics.com_syed_sir_classes_concepts;

import java.util.List;

// Notes::Important
//String name ---->" hello world 1"
/*hello world 1"
01234567890123

splitting char = "l"
" he"
null
"o wor"
"d 1"

splitting char = " "
null
"hello"
"world"
"1"

slitting character = "o"

" hell"
" w"
"rld 1"*/
public class SplitMethodConceptsRunner {

	public static void main(String[] args) {
		splitString();
	}

	public  static void splitString() {

		String stringInputByUser = " hello world 1";

		String[] splittedString = splittedString(stringInputByUser, "o");
		for (String individualString : splittedString) {
			individualString = individualString.isEmpty() ? "null" : individualString;
			System.out.println(individualString);

		}
	}

	public static String[] splittedString(String stringInputByUser, String splitCharacter) {

		return stringInputByUser.split(splitCharacter);

	}

}
