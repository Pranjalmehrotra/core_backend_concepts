package com.java_basics.com.functional_programming_concepts;

import java.util.List;

public class FunctionalProgramming {
	
	public void printNumbersListFunctionalApporach(List<Integer> numbers) {
		numbers.stream().forEach(
				element->System.out.println("Element is ::" + element)
				);
}
	
	public void printOddNumbersFunctionalApproach(List<Integer> numbers) {
		
		numbers.stream().filter(
				element->element % 2!= 0
				).forEach(
					element ->System.out.println("Odd number::"+ element)
						);
	}
	
	
	//Method 1 --->Via Normal Apporach(Object approach)
	
	public void sumOFNumbersObjectApporach(List<Integer> numbers) {
		Double sum = 0.0;
		for(Integer num:numbers) {
			sum = sum + num;
			
		}
		System.out.println("Sum of the numbers in the list by the normal apporach is :" + sum);
	}
	
	//Method2 --->Via Functional Apporach
	public void sumOFnumbersFunctionalApporach(List<Integer> numbers) {
		Integer sumFunctionalWay = numbers.stream().reduce(
				0,(number1,number2)->number1 + number2
				);
		System.out.println("Sum of the numbers in the list by the functional apporach is :" + sumFunctionalWay);
	}
	
	//********************************************************************************************************
	public void sumOfOddNumbersFunctionalApporach(List<Integer>numbers) {
		Integer sumOddNumbers = numbers.stream().filter(
				element->element%2 == 1
				).reduce(0,(element1,element2)->element1 + element2
						);
		System.out.println("Sum of the odd numbers in the list by the functional apporach is :: " + sumOddNumbers);
		
		
	}
	//************************************************************************************************************
	public void sumOfEvenNumberFunctionalApporach(List<Integer>numbers) {
		Integer sumOfEvenNumbers = numbers.stream().filter(
				element->element%2==0
				).reduce(
						0,(element1,element2)->element1 + element2
						);
		System.out.println("Sum of the odd numbers in the list by the functional apporach is :: " + sumOfEvenNumbers);
	}
	
}
