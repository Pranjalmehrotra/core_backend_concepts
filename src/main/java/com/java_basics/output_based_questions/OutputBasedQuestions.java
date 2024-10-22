package com.java_basics.output_based_questions;

import java.util.ArrayList;
import java.util.List;

public class OutputBasedQuestions {
	
	//Instant variable Of array
	int arr[];

	// Ques 1 ---->First Question
	public static String outputBasedOne() {
		String resultString = "Sample";

		// TODO Auto-generated method stub
		if ((isItSmall(3) && isItSmall(6))) {
			System.out.println("Result is false");
		}

		if ((isItSmall(6) && isItSmall(9))) {
			System.out.println("Result is true");
		}
		return resultString;

	}

	public static boolean isItSmall(int i) {

		if (i < 5) {
			System.out.println("i < 5");
			return false;
		}

		else {
			System.out.println("i > 5");
			return true;
		}
	}
//------------------------------------------------------------------------------------------------------------------------------------

//Ques 2 -->2nd Question

	public static String outputBasedsecond() {
		String name = "Pranjal";
		Long x = 42L;
		Long y = 44L;
		System.out.print(" " + 7 + 2 + " ");
		System.out.print(foo() + x + 5 + " ");
		System.out.print(x + y + foo());
		return name;
	}

	static String foo() {
		return "foo";
	}

//---------------------------------------------------------------------------------------------------------------------------------------
//Ques3---->3rd Question

	public static void callByReferenceExample() {
		int x = 6;
		OutputBasedQuestions p = new OutputBasedQuestions();
		p.doStuff(x);
		System.out.print(" main x = " + x);
		
		/*
		 * public void doStuff(int x) { System.out.print(" doStuff x =" + ++x);
		 * 
		 * }
		 */
	}

	
	  public void doStuff(int x) { System.out.print(" doStuff x =" + ++x);
	  
	  }
//------------------------------------------------------------------------------------------------------------------------
//Ques4--->4th Question
	  
	  public static void removeFromArray() {
		  
		  	List<Integer> numList = List.of(12,45,67,89);
			ArrayList<Integer>numListArray = new ArrayList<Integer>(numList);
			
			//It will remove the value from the array
			numListArray.remove(Integer.valueOf(67));
			
			//It will not remove the value from the array-->It will give exception ArrayOut of boud index.
			numListArray.remove(67);
		  
	  }
	  
	  

}
