package com.exam.service;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.UserRepository;

import java.util.Set;

public interface UserService {

    //creating user
    public User creatUser(User user, Set<UserRole> userRoles) throws Exception;
    //get user by username
    User getUser(String username);
    //delete User by Username
    void deleteUser(Long id);
}
