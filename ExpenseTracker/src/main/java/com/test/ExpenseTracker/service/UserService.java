package com.test.ExpenseTracker.service;

import com.test.ExpenseTracker.model.User;
import com.test.ExpenseTracker.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public String createUser(User user) {
        userRepo.save(user);
        return "user added.";
    }

    public Iterable getAllUsers() {
        return userRepo.findAll();
    }
}
