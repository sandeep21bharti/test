package com.learn.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee //implements Comparator<Employee>
{
	String firstName;
    int salary;
    
    
	public Employee(String firstName, int salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", salary=" + salary + "]";
	}
	/*@Override
	public int compare(Employee o1, Employee o2) {
		return 0;
	}*/
    
    
    
    
    
    
}



public class LambdaForEmployeeCompartor {

	public static void main(String[] args) {
      
		List<Employee>list=new ArrayList<>();
		list.add(new Employee("summit",12000));
		list.add(new Employee("Anil",11000));
		list.add(new Employee("yogendra",120000));
		list.add(new Employee("mohit",15000));
		
		/*
		 * System.out.println("##########Simple Sorting by Annonymous###############");
		 * 
		 * Collections.sort(list, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { return
		 * o1.getFirstName().compareTo(o2.getFirstName()); } });
		 * 
		 * list.forEach(System.out::println);
		 */
		
		System.out.println("############By lambda expression####################");
		
		Collections.sort(list, (e1,e2)-> e1.getFirstName().compareTo(e2.getFirstName()));
		list.forEach(System.out::println);
		
	}

}
