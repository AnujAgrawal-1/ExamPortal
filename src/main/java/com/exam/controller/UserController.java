package com.exam.controller;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    //creating user
    @PostMapping("/")
    public User creatUser(@RequestBody User user) throws Exception {
        Set<UserRole> userRole = new HashSet<>();
        userRole.add(new UserRole(user, new Role(45L, "Normal")));
        return this.userService.creatUser(user, userRole);
    }

    //get User
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return this.userService.getUser(username);
    }

    //delete User
    @DeleteMapping("/{userid}")
    public void deleteUser(@PathVariable("userid")Long id){
        this.userService.deleteUser(id);
    }
}
