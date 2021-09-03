package com.learn.shallowcopy;

public class Employee implements Cloneable{//Marker interface
	String name;
	int age;

	

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1=new Employee("Amit", 24);
		Employee e2= (Employee) e1.clone();
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("After make changes ......");
		e2.setName("John");
		
		System.out.println(e1);
		System.out.println(e2);//This means if class has only primitive fields then both the objects original
		//and cloned object are seperated not refrence to the same.
		
		System.out.println(e1.hashCode() +" "+ e2.hashCode());//different hashcode.
		
		

	}

}
