package com.test.ExpenseTracker.controller;

import com.test.ExpenseTracker.model.User;
import com.test.ExpenseTracker.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Validated
@Api(tags="Expense Management")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("Create a user")
    @PostMapping("user")
    public String createUser(@Valid @RequestBody User user){
        return userService.createUser(user);
    }

    @ApiOperation("get all users")
    @PostMapping("users")
    public Iterable getAllUsers(){
        return userService.getAllUsers();
    }

}
