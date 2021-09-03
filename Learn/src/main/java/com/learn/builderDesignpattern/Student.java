package com.learn.builderDesignpattern;

public class Student {
	// mandatory
	private String firstName; // mandatory
	private String lastName; // mandatory

	// optional
	private String age;
	private String gender;
	private boolean isGraduate;
	private boolean hasExperience;
	private String city;
	private String state;
	private boolean isEarning;
	
	

	private Student(StudentBuilder studentBuilder) { /* intailize the filed from  studentBuilder object
		the main thing to notice here finally we get the object intialized the mandatory fields and some optional fields is still blank */
		
		this.firstName = studentBuilder.firstName;
		this.lastName = studentBuilder.lastName;
		this.age = studentBuilder.age;
		this.gender = studentBuilder.gender;
		this.isGraduate = studentBuilder.isGraduate;
		this.hasExperience = studentBuilder.hasExperience;
		this.city = studentBuilder.city;
		this.state = studentBuilder.state;
		this.isEarning = studentBuilder.isEarning;
	}

   

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", isGraduate=" + isGraduate + ", hasExperience=" + hasExperience + ", city=" + city + ", state="
				+ state + ", isEarning=" + isEarning + "]";
	}



	public static class StudentBuilder {

		// mandatory
		private String firstName; // mandatory
		private String lastName; // mandatory

		// optional
		private String age;
		private String gender;
		private boolean isGraduate;
		private boolean hasExperience;
		private String city;
		private String state;
		private boolean isEarning;

		// We can set manadatory parameter in constructor or we can set by methods like
		// optional also.
		public StudentBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public StudentBuilder addAge(String age) {
			this.age = age;
			return this;

		}

		

		public StudentBuilder addGender(String gender) {
			this.gender = gender;
			return this;

		}

		public StudentBuilder addisGraduate(boolean isGraduate) {
			this.isGraduate = isGraduate;
			return this;
		}

		public StudentBuilder addHasExperience(boolean hasExperience) {
			this.hasExperience = hasExperience;
			return this;
		}

		public StudentBuilder addCity(String city) {
			this.city = city;
			return this;
		}

		public StudentBuilder addState(String state) {
			this.state = state;
			return this;
		}

		public StudentBuilder addIsEarning(boolean isEarning) {
			this.isEarning = isEarning;
			return this;
		}
		
		public Student build(){
			return new Student(this); /* Passing the  StudentBuilder obj to main student class to construct the 
			the final Student Object */
		}
	}

}
