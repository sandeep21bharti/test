package com.learn.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee  {
	int rollno;
	String name;
	int age;

	public Employee(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	/*
	 * @Override //Age wise sorting public int compareTo(Student o) { if (this.age
	 * == o.age) return 0; else if (this.age > o.age) return 1; else return -1; }
	 */
	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
	
	static class AgeComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			if (o1.age == o2.age)
				return 0;
			else if (o1.age > o2.age)
				return 1;
			else 
				return -1;
		}
		
	}
	
	static class NameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.name.compareTo(o2.name); // provide natural ordering of String 
		}
		
	}

	

}

public class ComparaterExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Vijay", 23));
		al.add(new Employee(106, "Ajay", 27));
		al.add(new Employee(105, "Jai", 21));
		al.add(new Employee(100, "Jai", 25));
		al.add(new Employee(107, "Amit", 25));
		
		System.out.println("Sort Employee using  AgeComparator..");
		Collections.sort(al, new Employee.AgeComparator());
		al.forEach(a->System.out.println(a));
		
		Collections.sort(al, new Employee.NameComparator());
		System.out.println("Sort Employee using  NameComparator..");
		al.forEach(a->System.out.println(a));
		

	}

}
