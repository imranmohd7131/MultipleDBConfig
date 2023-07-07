package com.multiple_db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multiple_db.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
