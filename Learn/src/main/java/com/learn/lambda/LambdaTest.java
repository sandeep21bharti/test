package com.learn.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employeee {
	String name;
	int id;
	int age;
	int salary;
	List<String>contacts;

	Employeee(String name, int id, int age, int salary, List<String>contacts) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.contacts=contacts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	
	
	

}

public class LambdaTest {

	public static void main(String[] args) {

		Supplier<Stream<Employeee>> streamSupplier = () -> {
			return Stream.of(new Employeee("ashish", 101, 43, 22000,Arrays.asList("123456789","487848475")), new Employeee("ashish", 101, 43, 20000,Arrays.asList("8947575","5555555")));
		};

		/*
		 * // total salary by 3 ways
		 * 
		 * int total =
		 * streamSupplier.get().collect(Collectors.summingInt(Employeee::getSalary));
		 * System.out.println("total salary=" + total);
		 * 
		 * int sum = streamSupplier.get().map(e -> e.getSalary()).reduce(0, (a, b) -> a
		 * + b); System.out.println("total salary=" + sum);
		 * 
		 * Integer sums = streamSupplier.get().mapToInt((e -> e.getSalary())).sum();
		 * System.out.println("total salary=" + sums);
		 */
		
		 //Map vs FlatMap
		List<List<String>>map=streamSupplier.get().map(e->e.getContacts()).collect(Collectors.toList());
		System.out.println(map);
		
		List<String>flatmap=streamSupplier.get().flatMap(e->e.getContacts().stream()).collect(Collectors.toList());
		System.out.println(flatmap);
	}

}
