package com.javabasics.com_generics;

import java.util.ArrayList;

/*
 * public class Generics {
 * 
 * ArrayList<String> list = new ArrayList<String>();
 * 
 * public void addElement(String element) { list.add(element); }
 * 
 * public void removeElement(String element) { list.remove(element); }
 * 
 * @Override public String toString() { return "Generics [list=" + list + "]"; }
 * 
 * 
 * }
 */

					//IMPLEMENTING THE GENERICS CONCEPT::

	//public class Generics<T>{

	//Now if we want only T type of number we can do as follows:: The advanctage with this is that, 
	//all the predefined methods present in the Number class will be present in the classes extending number 
	//and whose return type matches with T.
  
	public class Generics<T extends Number>{
		
		ArrayList<T>list = new ArrayList<>();
		
		public void addElement(T element) {
			list.add(element);
			
		}
		public void deleteElement(T element) {
			list.remove(element);
		}
		public T get(Integer index) {
			T indexValue = list.get(index);
			return indexValue;
			}
		}
	





