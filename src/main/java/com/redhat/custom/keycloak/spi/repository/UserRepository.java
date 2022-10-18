package com.redhat.custom.keycloak.spi.repository;

import com.redhat.custom.keycloak.spi.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
