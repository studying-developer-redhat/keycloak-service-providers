package com.redhat.keycloak.spi.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@EqualsAndHashCode
@NamedQueries({
        @NamedQuery(name="getUserByUsername", query="select u from User u where lower(u.username) = lower(:username)"),
        @NamedQuery(name="getUserByEmail", query="select u from User u where lower(u.email) = lower(:email)"),
        @NamedQuery(name="getUserCount", query="select count(u.id) from User u"),
        @NamedQuery(name="getAllUsers", query="select u from User u"),
        @NamedQuery(name="searchForUser", query="select u from User u where ( lower(u.username) like :search or lower(u.email) like :search ) order by u.username")
})
@Entity
@Table(name = "USERS", schema = "OT", catalog = "")
public class User implements Serializable {

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId()
    @JoinColumn(name = "ID_PERSON")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Person person;

    @Basic
    @Column(name = "DS_USERNAME", nullable = false, length = 25)
    private String username;

    @Basic
    @Column(name = "DS_PASSWORD", nullable = false, length = 100)
    private String password;

    @Basic
    @Column(name = "DS_EMAIL", nullable = false, length = 255)
    private String email;

}
