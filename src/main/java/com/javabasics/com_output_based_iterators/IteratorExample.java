package com.javabasics.com_output_based_iterators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public void iteratorSimplePrintingElements(ArrayList<String> nameList) {
		Iterator<String> nameListIterator = nameList.iterator();
		while (nameListIterator.hasNext()) {
			System.out.print(nameListIterator.next());
			System.out.println();
		}
		System.out.println("First Example Ended");
		System.out.println("*********************************************");

	}
//-----------------------------------------------------------------------------------------------------------------------------
	public void iteratorRemoveElementsCondition(ArrayList<String> nameList) {
		Iterator<String> nameListIterator = nameList.iterator();
		while (nameListIterator.hasNext()) {
			if (nameListIterator.next().endsWith("sh")) {
				// System.out.println(nameListIterator.next());
				// System.out.println("IteratorExample.iteratorSecondExample()");
				nameListIterator.remove();
			}
		}
		System.out.println("Address of iterator is ::" + nameListIterator);
		System.out.println("Elements of the array are ::" + nameList.toString());

		/*
		 * for(int i = 0; i < nameList.size();i++) {
		 * 
		 * System.out.println(nameList.get(i)); }
		 */
		/*
		 * while(nameListIterator.hasNext()) {
		 * System.out.println("IteratorExample.iteratorSecondExample-2()");
		 * System.out.println(nameListIterator);
		 * 
		 * }
		 */
		System.out.println("Second Example Ended");
		System.out.println("**********************************************");
	}

	// ----------------------------------------------------------------------------------------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("Pranjal", "Susparsh", "Ravi", "Rajesh", "Sukesh");
		ArrayList<String> nameList = new ArrayList<String>(names);
		IteratorExample iteratorExample = new IteratorExample();
		for (int i = 0; i < 1; i++) {
			iteratorExample.iteratorSimplePrintingElements(nameList);
			iteratorExample.iteratorRemoveElementsCondition(nameList);
		}

	}

}
