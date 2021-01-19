package com.akatsukilab.orders.service;

import java.util.List;
import java.util.Optional;

import com.akatsukilab.orders.models.User;

public interface UserService {

    public List<User> getUsers();

    public  Optional<User> getUser(String userId);

    public void saveUser(User user);

    public void deleteUser(String userId);

    public User editUser(User user);
    
}
