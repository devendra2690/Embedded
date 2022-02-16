package com.devendra.brain.Ebedded;

import javax.persistence.Embeddable;

//Embeddable types can be re-used across your project by any number of entities.
// This is shared class now, any one wants same properties in their class do not have to create one explicitly those in their class
// use @Embedded ContactPerson contactPerson. Thats it
// Defination : An embeddable class is a class that is not used by itself, only as part of one or more Entity classes. 
// An entity class can contain both single embedded classes and collections of such classes.
//Such classes must satisfy the same rules as the Entity classes, except that they do not have to contain a primary key and be marked with the Entity annotation

@Embeddable
public class ContactPerson {

	private String firstName;
	private String lastName;
	private Long empId;
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
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	
	
}
