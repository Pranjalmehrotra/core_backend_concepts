package com.javabasics.com_syed_sir_classes_concepts;

import java.util.*;
import java.util.stream.Collectors;

public class TwoDimensionalArray {
	public static void main(String[] args) {

		String ss[][] = { { "Bobby", "87" }, { "Charles1", "100", "75" }, { "Eric", "64" }, { "Charles", "22", "95" } };
		List<Student> students = new ArrayList<>();
		for (String[] s : ss) {
			students.add(Student.fromArrayList(List.of(s)));
		}
		Student topper = Collections.max(students, Comparator.comparing(Student::getAverage));
		System.out.println(topper.name + "::" + topper.avg);
	}
}

class Student {
	String name;
	List<Integer> marks;
	double avg;

	static Student fromArrayList(List<String> list) {
		String name = list.get(0);

		List<Integer> marks = list.subList(1, list.size()).stream().mapToInt(Integer::parseInt).boxed()
				.collect(Collectors.toList());
		double avg = list.subList(1, list.size()).stream().mapToInt(Integer::parseInt).sum() / (list.size() - 1);
		return new Student(name, marks, avg);
	}

	private Student(String name, List<Integer> marks, double avg) {
		this.name = name;
		this.marks = marks;
		this.avg = avg;
	}

	double getAverage() {

		return avg;
	}
}
