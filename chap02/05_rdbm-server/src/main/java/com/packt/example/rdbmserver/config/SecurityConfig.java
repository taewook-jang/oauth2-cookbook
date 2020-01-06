package com.packt.example.rdbmserver.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("dandi").password("$2a$04$j0PAMh0RCGjwabfKHeMWfeUt5/aBfkcG8Clz/cpNzWuWICMHBgxmC").roles("USER")
                .and()
                .withUser("admin").password("{noop}password").roles("ADMIN");

    }

}


