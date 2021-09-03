package com.learn.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {

	public static void main(String[] args) {

		
		List<String>list=new ArrayList<>();
		list.add("ABC");
		list.add("BNM");
		list.add("HJK");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			String value=itr.next();
			System.out.println(value);
			
			//list.remove(value);//this will generate concurrent modification execption.
			itr.remove();
			
		}
		System.out.println(list.size());
	}

}
