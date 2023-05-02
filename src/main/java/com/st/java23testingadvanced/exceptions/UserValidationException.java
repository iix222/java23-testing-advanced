package com.st.java23testingadvanced.exceptions;

public class UserValidationException extends Exception{
    private static final long serialVersionID = 1L;

    public UserValidationException(String name, String message) {
        super(String.format("User validation failed for user: %s, Error: %s", name, message));
    }
}
