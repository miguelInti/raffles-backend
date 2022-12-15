package com.raffles.services;

import com.raffles.entities.User;

public interface UserService {

    public User saveUser(User user) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);

}
