package com.learn.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employees{
	
	String name;
	int salary;
	int age;
	
	
	
	
	public Employees(String name, int salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employees [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
}

public class PredicateExample {

	public static void main(String[] args) {
      List<Employees>elist=new ArrayList<>();
      elist.add(new Employees("Charli", 2000, 25));
      elist.add(new Employees("summit", 4000, 28));
      elist.add(new Employees("Anil", 3000, 24));
      elist.add(new Employees("Yogesh", 7000, 30));
      
      //Preicate for whose age is greater than 25
      Predicate<Employees>predicateAge =(e)-> e.getAge()>25;
        
      System.out.println("########Age>25###################");
      for (Employees employees : elist) {
		   if(predicateAge.test(employees)){
			   System.out.println(employees.getName());
		   }
    	  
	}
      
    //Preicate for whose age is greater than 25
      Predicate<Employees>predicateForSalary =(e)->  e.getSalary()>3000;
      System.out.println("######## salary>3000###################");
      for (Employees employees : elist) {
		   if(predicateForSalary.test(employees)){
			   System.out.println(employees.getName());
		   }
      
	}
      
    //Predicate with join (when two predicate join)
    //Suppose we want above two implemented condiotions simulatenoulsy
      for (Employees s : elist) {
		   if(predicateAge.and(predicateForSalary).test(s)){
			   System.out.println(s);
		   }
     
	}
      
	}

}
