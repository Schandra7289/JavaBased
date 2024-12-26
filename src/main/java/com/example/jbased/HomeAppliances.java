package com.example.jbased;

import java.util.Arrays;
import java.util.List;

public class HomeAppliances implements Category {

	@Override
	public List<String> getAllProducts() {
		return Arrays.asList("Washing Machine", "Refrigerator","Mixer");
	}

}
