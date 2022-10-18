package com.redhat.keycloak.spi.repository;

import com.redhat.keycloak.spi.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
