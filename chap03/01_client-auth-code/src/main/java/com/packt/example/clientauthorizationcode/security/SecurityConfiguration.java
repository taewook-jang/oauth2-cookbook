package com.packt.example.clientauthorizationcode.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //@formatter:off
        http
            .authorizeRequests().antMatchers("/", "/index.html").permitAll().anyRequest().authenticated().and()
            .formLogin().and()
            .logout().permitAll();

        http.headers().httpStrictTransportSecurity().disable();
      //@formatter:on
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        // the size can be between 4 to 31
        return new BCryptPasswordEncoder(4);
    }

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder(4).encode("dandi"));
    }

}
