package com.CSVToXML.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapConvert {

	public static void main(String[] args) {

List<Integer> al=new ArrayList<>(Arrays.asList(1,4,3,6,5,8));

Map<Object, Object> hm=new HashMap<>();
int temp=3;
 //hm=al.stream().collect(Collectors.toMap(map-> map,map-> map));
 

 AtomicInteger c=new AtomicInteger(1);
 hm=al.stream().collect(Collectors.toMap(am->c.incrementAndGet(), map->map));
 for(Map.Entry entry: hm.entrySet()) {
	 System.out.println(entry.getKey()+"==>"+entry.getValue());
 }
 
	}

}
