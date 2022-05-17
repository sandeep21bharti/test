package com.CSVToXML.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortMapByValue {

	public static void main(String[] args) {
Map<Integer,Integer> hm=new LinkedHashMap<>();

hm.put(1, 6);
hm.put(2, 5);
hm.put(3, 4);
hm.put(4, 3);
hm.put(5, 2);
hm.put(6, 1);
System.out.println(hm);
List<Entry<Integer, Integer>> list=hm.entrySet().stream().collect(Collectors.toList());
hm.keySet().stream().forEach(abc->System.out.println(abc));
Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
	
	@Override
	public int compare(Entry<Integer, Integer> obj1,Entry<Integer, Integer> obj2) {
		return  obj1.getValue()>obj2.getValue() ? 1: -1;
	}
});
System.out.println(list);

	}

}
