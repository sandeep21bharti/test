package com.learn.EmployeeManagementQueryByLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class Employee {
	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
}

public class EmployeeManagementQueriesByLambda {

	public static void main(String[] args) {

		// https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// How many male and female employees are there in the organization?
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);

		// Print the name of all departments in the organization?
		List<String> departmentNames = employeeList.stream().map(Employee::getDepartment).distinct()
				.collect(Collectors.toList());
		System.out.println(departmentNames);

		// What is the average age of male and female employees?)
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		avgAgeOfMaleAndFemaleEmployees.forEach((k, v) -> System.out.println(k + "  " + v));

		// Get the details of highest paid employee in the organization?
		Comparator<Employee> comp = (e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1;
		Optional<Employee> optional = employeeList.stream().collect(Collectors.maxBy(comp));
		System.out.println(optional.get());

		// Get the names of all employees who have joined after 2015?
		List<Employee> list = employeeList.stream().filter(e -> e.getYearOfJoining() > 2015)
				.collect(Collectors.toList());
		list.forEach(e -> System.out.println(e));

		// Count the number of employees in each department?
		Map<String, Long> numberOfEmployeeIndepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(numberOfEmployeeIndepartment);

		// What is the average salary of each department?
		Map<String, Double> avgSalaryOfDepartments = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryOfDepartments);

		// Get the details of youngest male employee in the product development
		// department?
		Optional<Employee> youngest = employeeList.stream()
				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Product Development"))
				.min(Comparator.comparingInt(e -> e.getAge()));
		System.out.println(youngest.get());

		// Who has the most working experience in the organization?
		Comparator<Employee> compaarator = (e1, e2) -> e1.getYearOfJoining() > e2.getYearOfJoining() ? -1 : 1;
		Optional<Employee> mostExperienced = employeeList.stream().collect(Collectors.maxBy(compaarator));
		System.out.println(mostExperienced.get());

		// How many male and female employees are there in the sales and marketing team?
		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = employeeList.stream()
				.filter(e -> e.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		countMaleFemaleEmployeesInSalesMarketing.forEach((k, v) -> System.out.println(k + "  " + v));

		// What is the average salary of male and female employees?
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingDouble(e -> e.getSalary())));
		avgSalaryOfMaleAndFemaleEmployees.forEach((k, v) -> System.out.println(k + "  " + v));

		// What is the salary of the whole organization?
		Double totalSalary = employeeList.stream().collect(Collectors.summingDouble(e -> e.getSalary()));
		System.out.println(totalSalary);
		
		//find maximum age of employee?
	Employee maxAge=	employeeList.stream().collect(Collectors.maxBy((a,b)->a.getAge()>b.getAge()?1:-1)).get();
	System.out.println("Max age="+maxAge);
	
	//other way to find Max age
	OptionalInt max=employeeList.stream().mapToInt(e->e.getAge()).max();
	if(max.isPresent())
        System.out.println("Maximum age of Employee: "+max.getAsInt());
	
	
	//Find the second highest salary
	Comparator<Employee>compForsecondHighestSalary=(a,b)-> a.getSalary() < b.getSalary() ? 1 : -1;
	 Employee secondHighestSalary=employeeList.stream().sorted(compForsecondHighestSalary).skip(1).findFirst().get();
	 
	 System.out.println("second highest salary="+secondHighestSalary);
	
	}
	
	

}
