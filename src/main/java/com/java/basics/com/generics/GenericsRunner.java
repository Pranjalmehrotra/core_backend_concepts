package com.java.basics.com.generics;
import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Generics generics = new Generics();
		
		//CASE 1 ---->Making the Generics class as of String Type
		/*
		 * Generics<String>genericString = new Generics<String>();
		 * genericString.addElement("67"); genericString.addElement("Pranjal"); String
		 * string = genericString.get(0);
		 * System.out.println("List value of stirng type is ::" + genericString.list);
		 * System.out.println("Genric value is ::" + genericString.toString());
		 * System.out.println("string value is ::" + string);
		 */

		//Now we want to add the integer to the above list as shown below.
		//It is giving error as the ArrayList which we have passed if of type String.
		
		//generics.addElement(Integer.valueOf(23));
		//generics.addElement(Integer.valueOf(46));
		
		//CASE 2 --->Making the Generics class as of the Integer type
		Generics<Integer> genericInteger = new Generics<>();
		genericInteger.addElement(Integer.valueOf(5));
		genericInteger.addElement(Integer.valueOf(45));
		genericInteger.addElement(Integer.valueOf(45));
		Integer number = genericInteger.get(2);
		System.out.println("List value of integer type is ::" + genericInteger.list);
		System.out.println("Number value is ::" + number);
		
		//CASE 3 --->Making the Generics class as of the Double type
				Generics<Double> genericDouble = new Generics<>();
				genericDouble.addElement(5.8);
				genericDouble.addElement(8.90);
				genericDouble.addElement(6.78);
				Double doubleValue = genericDouble.get(2);
				System.out.println("List value of integer type is ::" + genericDouble.list);
				System.out.println("Double value is ::" + doubleValue);
		
		
				 ArrayList<Integer> duplicateIntegers = new ArrayList<>(List.of(1,2,3,4,5,6));
				 duplicate(duplicateIntegers);
				 System.out.println("Duplicate Integer value is ::" + duplicateIntegers);
		
		

	}
	
	//  GENERICS WITH METHODS:::
	
	static  <X> X doubleValue(X value){
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	

}
