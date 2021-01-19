package com.akatsukilab.orders.repository;

import java.util.List;

import com.akatsukilab.orders.models.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User,String> {
    

    public List<User> findByName(String name);
}
