package com.redhat.custom.keycloak.spi.service;

import com.redhat.custom.keycloak.spi.model.entity.User;
import com.redhat.custom.keycloak.spi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
