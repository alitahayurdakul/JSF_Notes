package com.luv2code.jsf.validatedemo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentOne {

	private String firstName;
	private String lastName;
	private String email;

	// create no-arg constructor
	public StudentOne() {
		
	}

	// define getter/setter methods
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}







