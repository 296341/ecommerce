package com.ecommerce.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.springbootecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")

public interface ProductRepository extends JpaRepository<Product, Long>{

}
