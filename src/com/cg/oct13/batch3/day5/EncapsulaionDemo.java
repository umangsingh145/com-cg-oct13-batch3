package com.cg.oct13.batch3.day5;

public class EncapsulaionDemo {
	public static void main(String[] args) {
		
		Employee emp=new Employee(11,"first",100);
		System.out.println(emp.toString());
		emp.setSalary(20000);
		System.out.println(emp.toString());
	}

}
