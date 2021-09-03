package com.learn.PassByValueAndReference;

import java.util.ArrayList;
import java.util.List;

public class PassingCollectionAsArgument {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		
		System.out.println("Size before modification="+list.size());
		modification(list);
		System.out.println("Size after modification="+list.size());
	}

	private static void modification(List<String> list) {
     list.add("C");
     list.add("D");
     System.out.println("Size in modification method= "+list.size());
	}

}
