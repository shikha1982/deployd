package com.devops.deployd.service;

import com.devops.deployd.model.User;
import com.devops.deployd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeploydService {

    @Autowired
    UserRepository userRepository;

    public User createUsers(User user) {
        return userRepository.save(user);
    }
}
