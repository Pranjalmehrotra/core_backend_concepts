package com.javabasics.com_important_programmes;

import java.util.List;
import java.util.stream.IntStream;

public class ImportantProgrammes {
	
	//PRINT SQUARES OF FIRST 11 NATURAL NUMBRS USING THE FUNCTIONAL PROGRAMMING.
	
	public static Integer  sumOfFirstTenNaturalNumbers() {
		//IntStream.range(1, 12).forEach(element->System.out.println("Numbers are::"+element));
		Integer sumFirstTenNaturalNumbers = IntStream.range(1, 12).reduce(
				0,(element1,element2)->element1 + element2
				);
		return sumFirstTenNaturalNumbers;
	}
	
	public static Integer sumOfSquaresOfFirstTenNaturalNumbers() {
		
		Integer sumOfSquaresOfFirst10NaturalNumbers = IntStream.range(1, 12).
				map(element -> element * element).
			reduce(0,(element1,element2)->element1 + element2);
		
		return sumOfSquaresOfFirst10NaturalNumbers;
				
	}
	
	public static void printingSumOfSquaresOfFirstTenNaturalNumbers() {
		
		IntStream.range(1, 12).
				map(element -> element * element).forEach(
						element->System.out.println("Elements are ::" + element)
						);
				
	}
	
	
	public static void convertToLowerCase(List<String>nameAnimal) {
		nameAnimal.stream().
		map(animalName->animalName.toLowerCase()).
		forEach(animalNameLowerCase->System.out.println("LowerCase converted names of animals are ::" + animalNameLowerCase));
		
		
	}
	
	public static void lenOfEachString(List<String>nameAnimal) {
		nameAnimal.stream().
		map(lenString->lenString.length()).
		forEach(lenString->System.out.println("Length of each name in list are ::" + lenString));
		
		
	}
	/*
	 * List<Integer>numList = List.of(10,23,33); numList.stream().map( e->e*e).
	 * forEach(element->System.out.println("Value of element is :"+ element));
	 */
	  
	 
	 //numList.stream();
	 
	//numList.stream().map(element -> element * element).forEach(element->System.out.println("Square numbers are::" + element));
	
	/////////////////////////////********TERMICAL OPERATIONS OF STREAM**********///////////////////////////////////
	
	//Finding the MAXIMUM of the number from the list.
	
	public static  Integer getMaxiumNumberFunctionalApporach(List<Integer>list) {
		Integer maxElement = list.stream().max(
				(n1,n2)->Integer.compare(n1, n2)
				).get();
		return maxElement;
		
		
		
		
		
	}
	









}
