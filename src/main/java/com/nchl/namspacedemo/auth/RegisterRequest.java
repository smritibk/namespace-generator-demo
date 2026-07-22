package com.nchl.namspacedemo.auth;

public record RegisterRequest(
        String userId,
        String password
) {
}
