package com.example.myfoodzapplication.model;

public class LoginResponse {
    private boolean status;

    public LoginResponse(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
}
