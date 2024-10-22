package com.java.basics.com.functional_programming_concepts;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1,5,6,7,9,60);

		FunctionalProgramming functionalProgramming = new FunctionalProgramming();
        //functionalProgramming.sumOFnumbersObjectApporach(numbers);		//
		functionalProgramming.sumOFnumbersFunctionalApporach(numbers);
		
		//

	}

}
