package com.learn.PassByValueAndReference;

import java.util.ArrayList;
import java.util.List;

public class my {

	public static void main(String[] args) {

		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		
		System.out.println("Size before modification="+list.size());
		modification(list);
		System.out.println("Size after modification="+list.size());
	}

	private static void modification(List<String> list) {
	 List<String>list1=new ArrayList<>();
     list1.add("C");
     list1.add("D");
     list1.add("E");
     list=list1;
     System.out.println("Size in modification method= "+list.size());
	}

}
