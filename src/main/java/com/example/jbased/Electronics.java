package com.example.jbased;

import java.util.Arrays;
import java.util.List;

public class Electronics implements Category {

	@Override
	public List<String> getAllProducts() {
		return Arrays.asList("Speakers", "Televison","Mobiles");
	}

}
