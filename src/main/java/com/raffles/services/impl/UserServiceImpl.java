package com.raffles.services.impl;

import com.raffles.entities.User;
import com.raffles.repositories.UserRepository;
import com.raffles.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) throws Exception {
        User localUser = userRepository.findByUsername(user.getUsername());
        if (localUser != null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya está registrado");
        }else{
            localUser = userRepository.save(user);
        }
        return localUser;
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
