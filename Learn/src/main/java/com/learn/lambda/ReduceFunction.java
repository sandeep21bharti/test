package com.learn.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//https://www.javabrahman.com/java-8/java-8-reducing-with-streams-reduce-method-tutorial-with-examples/
public class ReduceFunction {
	static List<EmployeeTest> employeeList = Arrays.asList(
		      new EmployeeTest("Tom Jones", 45, 7000.00),
		      new EmployeeTest("Harry Major", 25, 10000.00),
		      new EmployeeTest("Ethan Hardy", 65, 8000.00),
		      new EmployeeTest("Nancy Smith", 22, 14000.00),
		      new EmployeeTest("Deborah Sprightly", 29, 9000.00));

	public static void main(String[] args) {
		
		
	//Total sum of all salaries	
	Double totalSalaryExpense=employeeList.stream().map(e->e.getSalary()).reduce(0.0, (a,b)->a+b);
    System.out.println("total salary ="+totalSalaryExpense);
		 
    //Using Stream.reduce() method for finding employee with maximum salary
    Optional<Double> maxSalary=employeeList.stream().map(e->e.getSalary()).reduce((s1,s2)-> s1>s2? s1:s2);
    if(maxSalary.isPresent())
    	  System.out.println("Employee with max salary: "+maxSalary.get());
    	}
	}




class EmployeeTest{
	  private String name;
	  private Integer age;
	  private Double salary;
	  public EmployeeTest(String name, Integer age, Double salary){
	    this.name=name;
	    this.age=age;
	    this.salary=salary;
	  } 
	 
	  
	  
	  
	  public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getAge() {
		return age;
	}




	public void setAge(Integer age) {
		this.age = age;
	}




	public Double getSalary() {
		return salary;
	}




	public void setSalary(Double salary) {
		this.salary = salary;
	}




	public String toString(){
	    return "Employee Name: "+this.name
	      +"  Age: "+this.age
	      +"  Salary: "+this.salary;
	  }
	}