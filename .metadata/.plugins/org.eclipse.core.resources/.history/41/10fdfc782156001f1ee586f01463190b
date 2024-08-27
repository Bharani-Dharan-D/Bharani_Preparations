package com.example.demo;

import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
 
@Service
@Transactional
public class ProductService {
 
    @Autowired
    private ProductRepository repo;
     
    public String listAll() {
        repo.findAll();
        return "index";
    }
     
    public String save(Product product) {
        repo.save(product);
		return "index";
    }
     
    public Product get(Integer id) {
        return repo.findById(id).get();
    }
     
    
    public String delete(Integer id) {
        repo.deleteById(id);
        return "index";
    }
  //* public List<Product> fetchAll() {
	//return repo.findAll();
	//} 
}