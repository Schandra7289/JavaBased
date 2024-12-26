package com.example.jbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Product {
	@Autowired
	@Qualifier("sports")
	private Category category;
	
	public void showProducts(){
		category.getAllProducts().forEach(System.out::println);
	}

}
