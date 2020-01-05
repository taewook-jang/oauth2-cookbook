package com.packt.example.rdbmserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@SpringBootApplication
public class RdbmServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RdbmServerApplication.class, args);
    }

    @RequestMapping("/callback")
    public void callbackOnGet(String code, String token_type, HttpServletRequest req) {
        log.info("code :: {}", code);
        log.info("req :: {}", req.getParameterMap());
    }
}
