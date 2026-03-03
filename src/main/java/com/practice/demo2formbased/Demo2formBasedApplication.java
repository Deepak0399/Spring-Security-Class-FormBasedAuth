package com.practice.demo2formbased;

import com.practice.demo2formbased.entity.User;
import com.practice.demo2formbased.dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Demo2formBasedApplication implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(Demo2formBasedApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("admin",bCryptPasswordEncoder.encode("admin123"),"ROLE_ADMIN");
        User user2 = new User("member",bCryptPasswordEncoder.encode("member123"),"ROLE_MEMBER");

        List<User> list = Arrays.asList(user1, user2);
        userRepo.saveAll(list);
    }
}
