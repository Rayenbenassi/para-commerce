package com.online.elmerchic.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "local_user")
@Getter
@Setter
@NoArgsConstructor
public class LocalUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id",nullable = false)
    Long id;

    @Column(name = "username" , nullable = false , unique = true)
    String userName;

    @Column(name="password",nullable = false,length = 1000)
    String password;

    @Column(name="email",nullable = false,unique = true)
    String email;

    @Column(name = "first_name",nullable = false)
    String firsName;

    @Column(name = "last_name",nullable = false)
    String lastName;



}
