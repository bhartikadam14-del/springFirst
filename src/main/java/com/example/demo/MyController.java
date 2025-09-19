package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	@Autowired
    Myrepo repo;
	@PostMapping("/")
	public User1  save(@RequestBody User1 c) {
	 return this.repo.save(c);	
	}
	
	@GetMapping("/")
	public List<User1>  show() {
	 return this.repo.findAll();	
	}
	
	@GetMapping("/{id}")
	public Optional<User1>  showById(@PathVariable int id) {
	 return this.repo.findById(id);	
	}
	
}
