package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.jbased.Address;
import com.example.jbased.Electronics;
import com.example.jbased.Employee;
import com.example.jbased.HomeAppliances;
import com.example.jbased.Product;
import com.example.jbased.Sports;

@Configuration
public class AppConfig {
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean
	public Sports sports() {
		return new Sports();
	}
	@Bean
	public Electronics electronics() {
		return new Electronics();
	}
	@Bean
	@Primary
	public HomeAppliances appliances() {
		return new HomeAppliances();
	}
	
	@Bean
	public Product product() {
		return new Product();
	}
}
