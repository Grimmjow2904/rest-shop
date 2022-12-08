package com.restshop.restshop.controller;

import com.restshop.restshop.service.TokenService;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthController {

    private static final Logger log = LogManager.getLogger(ProductController.class);

    private final TokenService tokenService;

    @PostMapping("/login")
    public String token(Authentication authentication){
        log.info("Token requested for user: {}",authentication.getName());
        String token = tokenService.generateToken(authentication);
        log.info("Token granted: {}",token);
        return token;
    }

}
