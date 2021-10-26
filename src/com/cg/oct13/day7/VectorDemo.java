package com.cg.oct13.day7;

import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo {
	public static void main(String[] args) {
       	Vector v = new Vector(3, 2); // initial capacity, increment
       	System.out.println(v.capacity()); // intial capcity
       	v.add(10);
       	v.add(20);
       	v.add(30);
       	v.add(40);
       	System.out.println(v.capacity()); // new capcity
 
       	Enumeration e = v.elements();
       	System.out.println("Vector elements are : ");
       	while (e.hasMoreElements()) {
            	System.out.println(e.nextElement());
       	}
 	}

}
