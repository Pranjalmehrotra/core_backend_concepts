package com.java_basics.output_based_questions;

public class OutputBasedQuestionsRunner {

	public static void main(String[] args) {
		
		String firstQuestionOutput = OutputBasedQuestions.outputBasedOne();
		System.out.println("The first-output is ::" + firstQuestionOutput);
		
		String secondQuestionOutput = OutputBasedQuestions.outputBasedsecond();
		System.out.println(" The second-output is ::" + secondQuestionOutput);
		
		OutputBasedQuestions.callByReferenceExample();
		
		OutputBasedQuestions outputBasedQuestions = new OutputBasedQuestions();
		System.out.println("The value of outbased array::" +outputBasedQuestions.arr);
		System.out.println("The value of outbased array first element::"+outputBasedQuestions.arr[0]);

	}
		
		

	}


