package com.learn.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
	
	public static void main(String s[]) {
	
		ArrayList<String>arrayList=new ArrayList<>(10);
		
		arrayList.add(0, "5");
		arrayList.add(1, "6");
		arrayList.add(1, "7");//it will remove the old value and shift to right side.
		System.out.println(arrayList);
		
		
		arrayList.remove(1);// remove the element from index 1 and shift the elements to left.
		System.out.println(arrayList);//remove the 
		
		/*
		 * LinkedList<String>ll=new LinkedList<>(); ll.add("ABC"); ll.add("BCD");
		 * 
		 * System.out.println(ll.get(1));
		 */
		
		
	}

}
