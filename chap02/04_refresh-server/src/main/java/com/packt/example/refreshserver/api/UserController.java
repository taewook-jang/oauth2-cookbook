package com.packt.example.refreshserver.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/api/profile")
    public ResponseEntity<UserProfile> hello() {
        /*User user = (User) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();*/

        String userName = "tw.jang";

        String email = userName + "@mailinator.com";

        UserProfile profile = new UserProfile();
        profile.setName(userName);
        profile.setEmail(email);

        return ResponseEntity.ok(profile);
    }

}
