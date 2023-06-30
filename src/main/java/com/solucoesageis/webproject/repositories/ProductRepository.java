package com.solucoesageis.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solucoesageis.webproject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
} 