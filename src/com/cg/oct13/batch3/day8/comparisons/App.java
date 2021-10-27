package com.cg.oct13.batch3.day8.comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {

//		Comparable<T>

//		Comparator<T>

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 10.6));
		empList.add(new Employee(102, "Monu", 20.6));
		empList.add(new Employee(103, "Tonu", 40.6));
		empList.add(new Employee(104, "Ponu", 30.6));
		
		
		System.out.println("Nefore sort");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}

		Collections.sort(empList, new SortBySalary());

		System.out.println("After sort");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}
		

//		List<Integer> list = new ArrayList<>();
//		System.out.println(list);
//		list = new LinkedList<>();
//		list = new Stack<>();
//
//		ArrayList<Integer> list2 = new ArrayList<>();
//		System.out.println(list2);
////		list2 = new LinkedList<>();

	}

}
