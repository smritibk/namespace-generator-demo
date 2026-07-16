package com.nchl.namspacedemo.auth;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {

    private static final String DIGITS = "0123456789";
    private static final SecureRandom random = new SecureRandom();
    private final AuthKeys authKeys;

    public AuthService(AuthKeys authKeys) {
        this.authKeys = authKeys;
    }

    public void generateOtp(Integer length, String email) {
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(DIGITS.length());
            otp.append(randomIndex);
        }

        String registerOtpAuthKey = authKeys.getRegisterOtpNamespace(email);

        Map<String, String> registerAuthOtp = new HashMap<>();

        registerAuthOtp.put(registerOtpAuthKey, otp.toString());

        System.out.println(registerAuthOtp);
    }


}
