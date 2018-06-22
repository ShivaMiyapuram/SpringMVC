package com.luv2code.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

// Model Class
public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favouriteLanguage;
	
	private List<String> operatingSystems;

	public Student() {	
		super();
		countryOptions = new LinkedHashMap<>();
		operatingSystems = new ArrayList<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("ARG", "Argentina");
		countryOptions.put("IND", "India");
		countryOptions.put("US", "United States");
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public List<String> getOperatingSystems() {
//		return operatingSystems.toString();
		return operatingSystems;
		
	}

	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems.add(operatingSystems);
	}
	
	

}
