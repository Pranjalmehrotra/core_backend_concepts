package com.javabasics.com_output_based_iterators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IteratorExampleRunner {

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
				// System.out.println("IteratorExampleRunner.iteratorSecondExample()");
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
		 * System.out.println("IteratorExampleRunner.iteratorSecondExample-2()");
		 * System.out.println(nameListIterator);
		 * 
		 * }
		 */
		System.out.println("Second Example Ended");
		System.out.println("**********************************************");
	}

	// ----------------------------------------------------------------------------------------------------------------------

	public static void valueRemovedFromHashMap(Map<Integer, String> iteratorMap, Integer keyValueToBeRemoved) {
		Iterator<Map.Entry<Integer, String>> iteratorValue = iteratorMap.entrySet().iterator();
		try {
			while (iteratorValue.hasNext()) {
				Map.Entry<Integer, String> entry = iteratorValue.next();
				if (entry.getKey() == keyValueToBeRemoved) {
					iteratorValue.remove();
				}

			}
			System.out.println("The value of the hashmap after removal of the key is ::" + iteratorMap);

		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("Pranjal", "Susparsh", "Ravi", "Rajesh", "Sukesh");
		ArrayList<String> nameList = new ArrayList<String>(names);

		Map<Integer, String> iteratorMap = new HashMap<Integer, String>();
		iteratorMap.put(1, "Pranjal");
		iteratorMap.put(2, "Mehrotra");
		iteratorMap.put(3, "Rajesh");
		iteratorMap.put(3, "Nishi");

		System.out.println("The map values are ::" + iteratorMap);

		IteratorExampleRunner iteratorExampleRunner = new IteratorExampleRunner();
		for (int i = 0; i < 1; i++) {
			iteratorExampleRunner.iteratorSimplePrintingElements(nameList);
			iteratorExampleRunner.iteratorRemoveElementsCondition(nameList);
		}
		valueRemovedFromHashMap(iteratorMap,1);
	}

}
