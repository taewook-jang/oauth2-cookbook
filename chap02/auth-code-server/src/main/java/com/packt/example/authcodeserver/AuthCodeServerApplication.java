package com.packt.example.authcodeserver;

import com.packt.example.authcodeserver.config.OAuth2Payload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@SpringBootApplication
public class AuthCodeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthCodeServerApplication.class, args);
    }

    @RequestMapping("/callback")
    public void callbackOnGet(String code, OAuth2Payload payload) {
        log.info("code :: {}", code);
        log.info("payload :: {}", payload);
    }

    /*@GetMapping("/callback2")
    public void callbackOnPost(OAuth2Payload payload) {
        log.info("access_token :: {}", payload);
    }*/
}
