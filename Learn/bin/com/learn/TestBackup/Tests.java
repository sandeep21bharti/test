package com.CSVToXML.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tests {

	public static void main(String[] args) {
System.out.println("test");
List<String> al=new ArrayList<>(Arrays.asList("abc","def","ghi","abc","dhi","gbc","aef"));
//System.out.println(al);
HashMap<String, List<String>> hm=new HashMap<>();
for(String s:al) {
	List<String> values=new ArrayList<String>();
	String temp=s.substring(1);
	//System.out.println(temp);
	if(!hm.containsKey(temp)){
		values.add(s);
		hm.put(temp, values);
	}
	else {
		values=hm.get(temp);
		values.add(s);
		//hm.put(temp, values);
	}
}

//for(Map.Entry entry:hm.entrySet()) {
//	System.out.println("entry values "+ entry.getKey()+"getting values respectivly"+entry.getValue());
//}
	List<List<String>> lls=new ArrayList<List<String>>();
	
	for(String key: hm.keySet()) {
		List<String> templls=new ArrayList<String>();
		templls.addAll(hm.get(key));
		lls.add(templls);
		
	}
System.out.println(lls);

	}

}
