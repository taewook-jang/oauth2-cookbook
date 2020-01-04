package com.packt.example.implicitserver;

import com.packt.example.implicitserver.config.OAuth2Payload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@SpringBootApplication
public class ImplicitServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImplicitServerApplication.class, args);
    }

    @RequestMapping("/callback")
    public void callbackOnGet(String code, String token_type, OAuth2Payload payload, HttpServletRequest req) {
        log.info("code :: {}", code);
        log.info("payload :: {}", payload);
        log.info("req :: {}", req.getParameterMap());
    }

    /*@GetMapping("/callback")
    public String callback() {
        return "callback_page";
    }*/
}
