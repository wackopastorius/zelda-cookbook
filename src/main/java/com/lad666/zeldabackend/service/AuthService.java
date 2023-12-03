package com.lad666.zeldabackend.service;

import com.lad666.zeldabackend.exception.ResourceNotFoundException;
import com.lad666.zeldabackend.model.AuthRequest;
import com.lad666.zeldabackend.model.User;
import com.lad666.zeldabackend.repository.UserRepository;
import com.lad666.zeldabackend.util.AuthTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepository;
    public User getValidatedUser(AuthRequest authRequest) throws ResourceNotFoundException {
        Optional<User> userToValidate = userRepository.findUserByEmail(authRequest.getEmail());
        if(userToValidate.isPresent()){
            if(AuthTool.validateUser(userToValidate.get(), authRequest.getPassword())){
                System.out.println("Is valid");
                return userToValidate.get();
            } else {
                System.out.println("Not valid");
                throw new ResourceNotFoundException("User", "Email", authRequest.getEmail());
            }
        }
        return null;
    }
}
