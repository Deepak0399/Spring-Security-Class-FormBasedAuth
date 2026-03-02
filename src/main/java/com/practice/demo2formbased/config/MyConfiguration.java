package com.practice.demo2formbased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MyConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf(c -> c.disable())
                .authorizeHttpRequests(request -> request
                                .requestMatchers("/test/admin").hasRole("ADMIN")
                                .requestMatchers("/test/member").hasRole("MEMBER")
                                .anyRequest().permitAll())
                .formLogin(form -> form
                        .loginPage("/test/login")
                        .loginProcessingUrl("/doLogin")
                        .defaultSuccessUrl("/test/admin"))
                .logout(logout -> logout.logoutUrl("/doLogout"));
        return httpSecurity.build();
    }
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
