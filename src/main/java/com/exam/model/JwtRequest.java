package com.exam.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtRequest {
    String username;
    String password;

    public JwtRequest() {
    }

    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
