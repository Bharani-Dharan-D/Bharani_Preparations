package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class star {
@RequestMapping("add/")
	public int start() {

		int a = 5, b = 6;
		return a + b;
	}
}
