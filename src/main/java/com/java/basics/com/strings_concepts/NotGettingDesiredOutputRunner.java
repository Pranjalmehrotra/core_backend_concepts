package com.java.basics.com.strings_concepts;

public class NotGettingDesiredOutputRunner {

	public static void main(String[] args) {
		char a = 'A';
		int x = 'A' + a;
		//char a = 65;
		System.out.println("Value of x is ::" + x);
		System.out.println("Value of a is ::" + a);

		// TODO Auto-generated method stub
		String removeOccurences = NotGettingDesiredOutput.removeOccurrences("daabcbaabcbc", "abc");
		System.out.println("The string after the remove occureneces are ::" + removeOccurences);
		

	}

}
