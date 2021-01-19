package com.akatsukilab.orders.service;

import java.util.List;
import java.util.Optional;

import com.akatsukilab.orders.models.User;
import com.akatsukilab.orders.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
User user1 = new User("1", "luis", "pena", "luis@gmail.com", "123", "admin");
User user2 = new User("2", "juan", "pena", "juan@gmail.com", "124", "admin");

userRepository.save(user1);
userRepository.save(user2);
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(String userId) {
       
        return userRepository.findById(userId);
    }

    @Override
    public void saveUser(User user) {
       userRepository.save(user);

    }

    @Override
    public void deleteUser(String userId) {
       userRepository.deleteById(userId);

    }

    @Override
    public User editUser(User user) {
        User userToEdit =  userRepository.findById(user.getId()).orElse(null);
      userToEdit.setEmail(user.getEmail());
      userToEdit.setLastName(user.getLastName());
      userToEdit.setName(user.getName());
      userToEdit.setOrderID(user.getOrderID());
      userToEdit.setType(user.getType());
        return userRepository.save(userToEdit);
    }
    
}
