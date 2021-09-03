package com.learn.collectionframework;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByValues {

	public static void main(String[] args) {

		SortHashMapByValues obj=new SortHashMapByValues();
		Map<String, Integer> map=obj.createHashMap();
		
		System.out.println("----Print map before Sorting ------");
		obj.printMap(map);
		
		boolean order = true;  // if true then ascending else descending.
		
		
		obj.sortHashMap(map, order);
		
				 
		
		//Sort map by java 8 stream
		obj.sortMapByStream(map);
			
	}
	
	
	
	 private  void sortHashMap(Map map,Boolean order) {
		 
		 //We are using linked list because it maintain insertion order.
		 List<Map.Entry<String,Integer>>list = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		 
		 //sort list 
		 Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				
				if(order) {
					 return  o1.getValue()>o2.getValue() ? 1: -1;
				}else {
					 return  o2.getValue()>o1.getValue() ? 1: -1;
				}
				
			}
		});
		 
		 
		 // Now we have sorted list .We fill LinkedHashMap because it will maintain insertion order while 
		 //hashMap not maintain insertion order.
    	 Map<String,Integer> sortedLinkedHashMap=new LinkedHashMap<>();
		 for( Entry<String,Integer> entryObj: list) {
			 sortedLinkedHashMap.put(entryObj.getKey(), entryObj.getValue());
		 }
		 
		 
		 System.out.println("----Print map after Sorting ------");
		 printMap(sortedLinkedHashMap);
		 
	}

    
	//print the sorted map
	  public void printMap(Map<String,Integer>map){
			 
		  map.forEach((k,v)->System.out.println(k+"            "+v));
		  
		  
	 }

	public Map<String,Integer>  createHashMap() {
		    Map<String, Integer> map = new HashMap<String, Integer>();
		    map.put("Apple", 65000);
			map.put("HP", 20000);
			map.put("Dell", 32000);
			map.put("Asus", 21478);
			map.put("Samsung", 36546);
			map.put("Lenovo", 19990);
		return map;
		 
		 
	 }
	
	
	public void sortMapByStream(Map<String,Integer> map) {
		
		System.out.println("------Sort hashMap key using  java 8 stream --------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		
		System.out.println("------Sort hasMap by values using java 8 stream --------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}

}
