package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jbased.Address;
import com.example.jbased.Employee;
import com.example.jbased.Product;

@SpringBootApplication
public class SpringBootJavabasedApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJavabasedApplication.class, args);
	}

	@Autowired
	private Employee employee;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Product product;
	@Override
	public void run(String... args) throws Exception {
		
		employee.greetMsg();
		product.showProducts();
		
	}

}
