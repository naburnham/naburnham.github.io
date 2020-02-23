package io.naburnham.springbootstarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="courses")
public class Course {
	
	@Id
	private String id;
	private String name;
	private int creditHours;
	private String description;
	
	public Course() {
	}
	
	public Course(String id, String name, int creditHours, String description) {
		super();
		this.id = id;
		this.name = name;
		this.creditHours = creditHours;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
