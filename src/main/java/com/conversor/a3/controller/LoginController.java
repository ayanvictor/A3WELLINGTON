package com.conversor.a3.controller;

import com.conversor.a3.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public ResponseEntity<?> autenticar(@RequestBody Map<String, String> dados) {
        String email = dados.get("email");
        String password = dados.get("password");

        if (loginService.autenticar(email, password)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(401).body("E-mail ou senha incorretos.");
        }
    }
}
