package com.CSVToXML.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortingByStrem {

	public static void main(String[] args) {
Employee e1=new Employee(3, "Ram1", 10L);
Employee e2=new Employee(4, "Ram2", 11L);
Employee e3=new Employee(1, "Ram3", 12L);
Employee e4=new Employee(2, "Ram4", 13L);
List<Integer> intList=new ArrayList<>(Arrays.asList(4,3,5,2,1));
	
List<Employee> elist=new ArrayList<Employee>(Arrays.asList(e1,e2,e3,e4));
System.out.println(elist.get(0).getId());
List<String> names=elist.stream().sorted(Comparator.comparing(Employee::getId))
.map(emp->emp.getName()).collect(Collectors.toList());
System.out.println("printing the names"+names);
//.forEach(System.out::println);
intList.stream().sorted().forEach(System.out::println);
		Optional<List<Employee>> empoptional=Optional.ofNullable(elist);
		if(empoptional.isPresent()){
			System.out.println("inside if block"+empoptional.get());
		}else {System.out.println("inside else block"+Optional.empty());}
		
		int[] intr= {3,4,6,5};
		System.out.println(Arrays.toString(intr));

	}

}

class Employee{
	int id ;
    String name;
    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	Long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
		 public String method() {
			return "this is general method";
		
	}
}
