package com.example.demo_testcontainers.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "users")
@Value
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    @Column(name = "u_login")
    @JsonProperty("u_login")
    String u_login;

    @Column(name = "email")
    String email;
}
