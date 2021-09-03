package com.learn.lambda;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	int age;
	String name;
	
	
	
	
	public Student(int age, String name) {
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
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
	
}


public class LambdaForStudent {

	public static void main(String[] args) {
		List<Student>studentList=new ArrayList<>();
		studentList.add(new Student(12, "Anil"));
		studentList.add(new Student(15, "Sumeet"));
		studentList.add(new Student(17, "Udit"));
		studentList.add(new Student(10, "Nitin"));
		
		
		//Student iterate by lambda
		studentList.forEach((student)-> System.out.println(student));
		System.out.println("-----------------------------");
		
		//Student iterate by method references
		studentList.forEach(System.out::println);
	}

}
