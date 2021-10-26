package com.cg.oct13.day7;
import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String args[]) {
       	ArrayList al = new ArrayList();
       	System.out.println("Size1: " + al.size());
       	al.add("A");
       	al.add("B");
       	al.add("C");
       	al.add(10);
       	al.add(10.5);
       	System.out.println("Size2: " + al.size());
       	System.out.println("ArrayList: " + al);
       	al.remove("A");
       	al.remove(2);
       	System.out.println("Size3: " + al.size());
       	System.out.println("ArrayList: " + al);
 
       	for (int i = 0; i < al.size(); i++) {
            	System.out.println(al.get(i));
       	}
 	}


}
