package com.learn.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;

class Student1{
	
	int age;
	String name;
		
	
	public Student1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + "]";
	}
	
	
	
}



public class LambdaForIterateMap {
	public static void main(String[] args) {
		
		Map<Integer,Student1>map=new HashMap<>();
		map.put(101, new Student1(12,"harsh"));
		map.put(106, new Student1(20,"summet"));
		map.put(107, new Student1(33,"kamal"));
		map.put(105, new Student1(23,"anil"));
		
		System.out.println("############### EntrySet#############");
		Set<Entry<Integer, Student1>>studentSet =map.entrySet();
		
		for( Entry<Integer, Student1>set:studentSet) {
			System.out.println(set.getKey() +"  "+set.getValue());
		}
		
		System.out.println("############### KeySet#############");
		Set<Integer>set=map.keySet();
		
		for(Integer i:set) {
			 System.out.println(i +"  "+map.get(i));
		}
		
		
		System.out.println("##################By Annonymous############");
		
		map.forEach(new BiConsumer<Integer, Student1>() {

			@Override
			public void accept(Integer t, Student1 u) {
				System.out.println(t+ " "+u);
			}
		});


		System.out.println("####################By Lambda expression##########");
		map.forEach((i,s)-> System.out.println(i + "  "+s));

	}

}
