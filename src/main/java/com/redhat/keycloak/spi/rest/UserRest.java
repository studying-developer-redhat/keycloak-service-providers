package com.redhat.keycloak.spi.rest;

import com.redhat.keycloak.spi.model.entity.User;
import com.redhat.keycloak.spi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserRest {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}
