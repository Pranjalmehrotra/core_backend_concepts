package com.java_basics.practise;

import java.util.ArrayList;
import java.util.Arrays;

public class PractiseRunner {
	
	Integer num = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	ArrayList<Integer>numListArray = new ArrayList<Integer>(Arrays.asList(23,45,78,89,89));
	numListArray.stream().forEach(
			num ->{
				System.out.println(num);
			});

	}
	
	void sample() {
		//PractiseRunner practiseRunner = new PractiseRunner();
		Integer numVarianble = num;
		
	}

}
