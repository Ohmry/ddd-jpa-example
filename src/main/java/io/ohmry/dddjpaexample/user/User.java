package io.ohmry.dddjpaexample.user;

import io.ohmry.dddjpaexample.core.annotations.Domain;

import javax.persistence.*;

@Domain
@Entity
public class User {
    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column
    @Enumerated(EnumType.STRING)
    private UserStatus status;

    public User () {}
    public User (String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }


}
