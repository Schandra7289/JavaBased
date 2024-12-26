package com.example.jbased;

import org.springframework.beans.factory.annotation.Value;

public class Address {

	private String city;
	

	public String getCity() {
		return city;
	}


	@Value("${employee.emp.city}")
	public void setCity(String city) {
		this.city = city;
	}

}
