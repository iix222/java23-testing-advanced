package com.st.java23testingadvanced.models;

import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
