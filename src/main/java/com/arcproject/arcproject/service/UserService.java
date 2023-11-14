package com.arcproject.arcproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arcproject.arcproject.interfaces.UserInterface;

@Service
public class UserService {
    private final UserInterface userInterface;

    @Autowired
    public UserService(UserInterface userInterface){
        this.userInterface = userInterface;
    }

    public UserInterface returnService(){
        return userInterface;
    }
}