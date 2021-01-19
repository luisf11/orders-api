package com.akatsukilab.orders.repository;

import com.akatsukilab.orders.models.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String>{
    
}
