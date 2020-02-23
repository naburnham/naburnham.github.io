package io.naburnham.springbootstarter.students;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	private int id;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String dateOfBirth;
	private String department;
	private double gradePointAverage;
	
	public Student() {
	}
	
	public Student(int id, String firstName, char middleInitial, String lastName, String dateOfBirth, String department, double gradePointAverage) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.gradePointAverage = gradePointAverage;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getGradePointAverage() {
		return gradePointAverage;
	}

	public void setGradePointAverage(double gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}

	public char getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}
}
