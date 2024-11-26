package com.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.model.Product;

public interface ProductRepository extends JpaRepository<Product , Integer> {
   
	
	
	
}
