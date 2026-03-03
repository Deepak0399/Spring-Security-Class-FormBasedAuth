package com.practice.demo2formbased.Service;

import com.practice.demo2formbased.dao.UserRepo;
import lombok.RequiredArgsConstructor;
import com.practice.demo2formbased.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@RequiredArgsConstructor
public class MyService implements UserDetailsService {

    private final UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        Optional<User> opt = userRepo.findByUsername(username);
        if (opt.isPresent()) {
            User user = opt.get();
            System.out.println(user);
            return new UserDetailsImpl(user);
        }
        else {
            throw new UsernameNotFoundException("User Not Found");
        }
    }
}
