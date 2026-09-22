package com.app.dto;

public class CreateUserRequest {
    private String username;
    private String password;
    private String email;

    public CreateUserRequest(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
