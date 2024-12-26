package com.example.jbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

	private String empName;
	
	@Autowired
	private Address address;


	@Value("${employee.empName}")
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void greetMsg() {
		System.out.println("Have a Great Day:" + empName);
		System.out.println(address.getCity());
	}

}
