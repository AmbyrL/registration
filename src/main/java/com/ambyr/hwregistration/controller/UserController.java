package com.ambyr.hwregistration.controller;

import com.ambyr.hwregistration.models.User;
import com.ambyr.hwregistration.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UsersRepo usersRepo;

    @GetMapping("/users")
    @CrossOrigin
    public List<User> getUsers() {
        return usersRepo.findAllByOrderByIdDesc();
    }

    @PostMapping("/user")
    @CrossOrigin
    public void saveUser(User user) {
        usersRepo.save(user);
    }
}

