package com.javabasics.com_important_programmes;

import java.util.List;

public class ImportantProgrammesRunner {

	public static void main(String[] args) {
		
		//List<Integer> newList = new ArrayList<>();
		

		// TODO Auto-generated method stub
		//ImportantProgrammes importantProgrammes = new ImportantProgrammes();
		ImportantProgrammes.sumOfFirstTenNaturalNumbers();
		System.out.println("Sum of firt 11 natural numbers are ::" + ImportantProgrammes.sumOfFirstTenNaturalNumbers());
		
		
		ImportantProgrammes.sumOfSquaresOfFirstTenNaturalNumbers();
		System.out.println("Sum of sqaures of first 10 natural numbers are ::" + ImportantProgrammes.sumOfSquaresOfFirstTenNaturalNumbers());
		
		
		ImportantProgrammes.printingSumOfSquaresOfFirstTenNaturalNumbers();
		
		
		List<String>animalName = List.of("CatsI","Bat","Rat");
		ImportantProgrammes.convertToLowerCase(animalName);
		
		ImportantProgrammes.lenOfEachString(animalName);
		
		
		List<Integer>numList = List.of(12,45,78);
		ImportantProgrammes.getMaxiumNumberFunctionalApporach(numList);
		System.out.println("Maximum element is ::" + ImportantProgrammes.getMaxiumNumberFunctionalApporach(numList));



		
		
		
}

}
