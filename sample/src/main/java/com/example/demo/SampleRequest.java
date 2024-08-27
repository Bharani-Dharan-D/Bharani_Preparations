package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRequest {
	@RequestMapping("/display")
		
	public String name() {
	return "Bharani";
	
	}
	@RequestMapping("/add/{a}/{b}")
int add(@PathVariable int a,@PathVariable int b) {
	return a+b;
}
}

