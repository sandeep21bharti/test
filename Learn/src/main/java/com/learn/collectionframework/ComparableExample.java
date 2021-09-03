package com.learn.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	String lastname;
	int age;

	public Student(int rollno, String name, int age,String lastname) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.lastname=lastname;
	}

	/*
	 * @Override //Age wise sorting public int compareTo(Student o) { if (this.age
	 * == o.age) return 0; else if (this.age > o.age) return 1; else return -1; }
	 */

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", lastname= "+lastname+", age=" + age + "]";
	}

	//Name wise sorting
	@Override
	public int compareTo(Student o) {
		System.out.println("hii");
		
		 int result=this.name.compareTo(o.name);//First check the first name 
		 //If firstname is equal then check the lastname
		 return result;
		 //==0? this.lastname.compareTo(o.lastname):result;
		
		
	}
	
	
	

}

public class ComparableExample {
	public static void main(String ...args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23,"kumar"));
		al.add(new Student(106, "Ajay", 27,"singh"));
		al.add(new Student(105, "Jai", 21,"jain"));
		al.add(new Student(107, "Ajay", 29,"tanwr"));
		al.add(new Student(107, "Aa", 29,"xyz"));
		al.add(new Student(107, "Yogendra", 29,"kumar"));
		
		Collections.sort(al);
		al.forEach(a->System.out.println(a));

	}
}