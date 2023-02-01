package com.luv2code.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFour {

	private String firstName;
	private String lastName;
	
	// since the user can select multiple languages
	// we need an array of strings
	
	private String[] favoriteLanguages; 

	public StudentFour() {
		
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

	public String[] getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public void setFavoriteLanguages(String[] favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}
	
	
}








