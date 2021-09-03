package com.learn.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalFieldTest {

	public static void main(String[] args) {
		List<Address> adressList = Arrays.asList(new Address(Optional.of("Abc@gmail.com"), "Line1"),
				new Address(Optional.of("bcd@yahoo.co.in"), "line2"));
		new Address(Optional.ofNullable(null), "Line3");

		Teacher teacher = new Teacher(1, 12000, adressList);

//Fetch only adress having email address related to yahoo.co.in

		List<Address> adressListContainsYahoo = teacher.getAddressList().stream()
				.filter(a -> a.getEmail().isPresent() && a.getEmail().get().toString().contains("yahoo.co.in"))
				.collect(Collectors.toList());
		adressListContainsYahoo.forEach(System.out::println);
	}

}

class Teacher {
	private int id;
	private int salary;
	private List<Address> addressList;

	public Teacher(int id, int salary, List<Address> addressList) {
		super();
		this.id = id;
		this.salary = salary;
		this.addressList = addressList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

}

class Address {
	private Optional<Object> email;
	private String line;

	public Address(Optional<Object> optional, String line) {
		super();
		this.email = optional;
		this.line = line;
	}

	public Optional<Object> getEmail() {
		return email;
	}

	public void setEmail(Optional<Object> email) {
		this.email = email;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	@Override
	public String toString() {
		return "Address [email=" + email + ", line=" + line + "]";
	}

	
	
	
}