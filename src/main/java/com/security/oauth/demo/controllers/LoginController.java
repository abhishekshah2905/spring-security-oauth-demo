package com.security.oauth.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LoginController {
    @RequestMapping("/user")
    public Principal getUser(Principal principal) {
        return principal;
    }
}
