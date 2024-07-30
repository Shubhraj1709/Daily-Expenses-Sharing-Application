package com.example.expance.service;

import com.example.expance.model.User;
import com.example.expance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace(); // Add this line
            throw new RuntimeException("Error creating user", e);
        }
    }

    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}


//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public User createUser(User user) {
//        return userRepository.save(user);
//    }
//
//    public User getUserById(Long id) {
//        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
//    }
//
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//}
