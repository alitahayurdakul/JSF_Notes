package com.luv2code.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFive {

	private String firstName;
	private String lastName;
	private String favoriteLanguage;
	
	public StudentFive() {
		// here we can read data from database. Default values.
		// pre-populate the bean
		firstName = "Mary";
		lastName = "Public";
		favoriteLanguage = "Ruby";
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
}
