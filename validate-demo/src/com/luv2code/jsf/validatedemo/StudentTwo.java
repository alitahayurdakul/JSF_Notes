package com.luv2code.jsf.validatedemo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {

	private String firstName;
	private String lastName;
	private String postalCode;
	private int freePasses;
	
	// create no-arg constructor
	public StudentTwo() {
		
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

}







