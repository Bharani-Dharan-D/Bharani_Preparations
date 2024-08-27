package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;

	// RESTful API methods for Retrieval operations

	// RESTful API method for Create operation

	// RESTful API method for Update operation

	// RESTful API method for Delete operation
	
	@GetMapping("/display")
	public String hello() {
		return "index";
	}
	@GetMapping("/products")
	public String list() {
		return service.listAll();
	}
	
	/*@GetMapping("/products/{id}")
	public ResponseEntity<Product> get(@PathVariable Integer id) {
	    try {
	        Product product = service.get(id);
	        return new ResponseEntity<Product>(product, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@GetMapping("/fetching")
	public List<Product> fetchlist() {
		return service.fetchAll();
	}*/
	
	@DeleteMapping("/products")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
	    try {
	        Product existProduct = service.get(id);
	        service.save(product);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	
	@PostMapping("/insertid")
	public String insert(@RequestBody Product prod) {
	    return service.save(prod);
	}
	


}
