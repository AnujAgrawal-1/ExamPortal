package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ExamserverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("starting code");
    //        User user =new User();
    //        user.setFirstName("Anuj");
    //        user.setLastName("Agrawal");
    //        user.setEmail("anuj@gmail.com");
    //        user.setProfile("anuj.png");
    //        user.setUsername("Anuj372");
    //        user.setPassword("000372");
    //
    //        Role role= new Role();
    //        role.setRoleId(44L);
    //        role.setRoleName("Admin");
    //
    //        Set<UserRole> userRoleSet = new HashSet<>();
    //        UserRole userRole =new UserRole();
    //        userRole.setRole(role);
    //        userRole.setUser(user);
    //        userRoleSet.add(userRole);
    //
    //        User user1=this.userService.creatUser(user,userRoleSet);
    //        System.out.println(user1.getUsername());

    }
}
