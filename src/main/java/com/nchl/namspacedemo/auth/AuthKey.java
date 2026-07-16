package com.nchl.namspacedemo.auth;

public enum AuthKey {
    USER("user"),
    OTP("otp"),
    LOGIN("login"),
    REGISTRATION("registration"),
    PASSWORD_RESET("password-reset");

    private final String value;

    AuthKey(String value){
        this.value=value;
    }

    public String value(){
        return value;
    }

}
