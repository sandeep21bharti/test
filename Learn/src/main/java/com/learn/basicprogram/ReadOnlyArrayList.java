package com.learn.basicprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayList {

	public static void main(String[] args) {

		List<String> fruitList = new ArrayList<String>();

		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add(null);
		List<String> readOnly = Collections.unmodifiableList(fruitList);
		try {
			readOnly.add("papya");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		fruitList.forEach(a-> System.out.println(a));

	}

}
