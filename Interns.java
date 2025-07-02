package com.oracle.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Interns {
	
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private char grade;
	
	private Interns() {}
	
	private Interns(Interns.Builder builder) {
		this.id=builder.id;
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.age=builder.age;
		this.grade=builder.grade;
	}
	
	private static class Builder{
		
		private int id;
		private String firstName;
		private String lastName;
		private int age;
		private char grade;
		
		public Builder setId(int id) {
			this.id=id;
			return this;
		}
		public Builder setFirstName(String firstName) {
			this.firstName=firstName;
			return this;
		}
		public Builder setLastName(String lastName) {
			this.lastName=lastName;
			return this;
		}
		public Builder setAge(int age) {
			this.age=age;
			return this;
		}
		public Builder setGrade(char grade) {
			this.grade=grade;
			return this;
		}
		
		public Interns build() {
			return new Interns(this);
		}
		
		
	}
	
	public static List<Interns> createInternsList(){
		return Arrays.asList(
				new Interns.Builder()
				.setId(1001)
				.setFirstName("sabbir")
				.setLastName("poonawala")
				.setAge(21)
				.setGrade('A')
				.build(),
				new Interns.Builder()
				.setId(1002)
				.setFirstName("amit")
				.setLastName("desai")
				.setAge(22)
				.setGrade('B')
				.build(),
				new Interns.Builder()
				.setId(1003)
				.setFirstName("priya")
				.setLastName("gupta")
				.setAge(23)
				.setGrade('C')
				.build(),
				new Interns.Builder()
				.setId(1004)
				.setFirstName("rohit")
				.setLastName("shah")
				.setAge(22)
				.setGrade('B')
				.build()
				
				);
	
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public char getGrade() {
		return grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, grade, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interns other = (Interns) obj;
		return age == other.age && Objects.equals(firstName, other.firstName) && grade == other.grade && id == other.id
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Interns [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", grade="
				+ grade + "]";
	}
	
	

}






