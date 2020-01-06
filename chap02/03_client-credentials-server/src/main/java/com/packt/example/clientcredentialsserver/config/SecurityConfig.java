package com.packt.example.clientcredentialsserver.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin();
    }*/

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("dandi").password("{noop}dandi").roles("USER")
                .and()
                .withUser("admin").password("{noop}password").roles("ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //@formatter:off
        http
                .authorizeRequests()
                .anyRequest().authenticated().and()
                .antMatcher("/user/**")
                .httpBasic()
                .and()
                .csrf().disable();
        //@formatter:on
    }

}


