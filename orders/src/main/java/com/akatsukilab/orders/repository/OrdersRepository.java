package com.akatsukilab.orders.repository;

import com.akatsukilab.orders.models.Order;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<Order,String> {
    
}
