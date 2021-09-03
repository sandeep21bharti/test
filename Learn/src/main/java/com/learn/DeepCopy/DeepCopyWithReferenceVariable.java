package com.learn.DeepCopy;



class Student implements Cloneable{
	String name;
	int id;
	Course course;
		
	public Student(String name, int id, Course course) {
		
		this.name = name;
		this.id = id;
		this.course = course;
	}
	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student= (Student) super.clone();
		student.course=(Course) student.course.clone();
		
		return student;
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", course=" + course + "]";
	}
	
	
}


class Course implements Cloneable{
	 String courseone;
	 String coursetwo;
	 
	public Course(String courseone, String coursetwo) {
		
		this.courseone = courseone;
		this.coursetwo = coursetwo;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	public String getCourseone() {
		return courseone;
	}
	public void setCourseone(String courseone) {
		this.courseone = courseone;
	}
	public String getCoursetwo() {
		return coursetwo;
	}
	public void setCoursetwo(String coursetwo) {
		this.coursetwo = coursetwo;
	}
	@Override
	public String toString() {
		return "Course [courseone=" + courseone + ", coursetwo=" + coursetwo + "]";
	}
	 
	 
}


public class DeepCopyWithReferenceVariable {
	public static void main(String args[]) throws CloneNotSupportedException {
	Course course =new Course("math","english");
	Student student=new Student("amit", 01, course);
	Student studentCopy=(Student) student.clone();
	
	System.out.println(student);
	System.out.println(studentCopy);
	System.out.println("After change one ..........");
	
	studentCopy.setName("rahul");
	studentCopy.course.courseone="science";
	
	System.out.println(student);
	System.out.println(studentCopy);//the changes is also reflected the original student courseone also.
	
	}
}
