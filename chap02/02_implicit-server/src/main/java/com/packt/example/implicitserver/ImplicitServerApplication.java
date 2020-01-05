package com.packt.example.implicitserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class ImplicitServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImplicitServerApplication.class, args);
    }

    /*@RequestMapping("/callback")
    public void callbackOnGet(String code, String token_type, OAuth2Payload payload, HttpServletRequest req) {
        log.info("code :: {}", code);
        log.info("payload :: {}", payload);
        log.info("req :: {}", req.getParameterMap());
    }*/

    /*@GetMapping("/callback")
    public String callback() {
        return "callback_page";
    }*/
}
