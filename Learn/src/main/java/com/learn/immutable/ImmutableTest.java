package com.learn.immutable;

import java.util.Calendar;
import java.util.Date;

final class Student {

	private final String name;
	private final int id;
	private final Date date;
	private final Age age;

	public Student(String s, int x, Date date, Age age) {
		this.name = s;
		this.id = x;
		this.date = new Date(date.getTime());
		Age ageDummy=new Age();
		ageDummy.setDay(age.getDay());
		ageDummy.setMonth(age.getMonth());
		ageDummy.setYear(age.getYear());
		this.age=ageDummy;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Date getDate() {
		return  new Date(date.getTime());
	}
	
	public Age getAge() {
	 Age temp=new Age();
	 temp.setDay(this.age.getDay());
	 temp.setMonth(this.age.getMonth());
	 temp.setYear(this.age.getYear());
	 
		return temp;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", date=" + date + ", age=" + age + "]";
	}

	public static Student getInstance(String str, int x, Date d ,Age age) {
		return new Student(str, x, d,age);

	}

}

public class ImmutableTest {
	static Student obj;
	public static void main(String s[]) {
		Age age =new Age();
		age.setDay(12);
		age.setMonth(3);
		age.setYear(1992);

		obj = Student.getInstance("yogendra", 32, new Date(),age);
		System.out.println(obj);
		modification(obj.getName(), obj.getId(), obj.getDate(),obj.getAge());
	}

	public static void modification(String s, int x, Date date,Age age) {
		s = "singh";
		x = 10;
		age.setYear(1993);// Age year is changed here.
		date.setDate(10);// date is changed here.
		System.out.println(obj);
	}

	
}