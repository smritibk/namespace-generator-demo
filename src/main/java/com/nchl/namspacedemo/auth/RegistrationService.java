package com.nchl.namspacedemo.auth;

import com.nchl.namespacegenerator.annotation.NamespaceContext;
import com.nchl.namespacegenerator.context.ContextAppender;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class RegistrationService {

    private static String DIGITS = "0123456789";

    private static final SecureRandom RANDOM = new SecureRandom();
    private final ContextAppender contextAppender;

    public RegistrationService(
            ContextAppender contextAppender) {
        this.contextAppender = contextAppender;
    }

    @NamespaceContext({"user"})
    public String generateOtp(RegisterRequest request) {
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int randomIndex = RANDOM.nextInt(DIGITS.length());

            otp.append(DIGITS.charAt(randomIndex));
        }

        //Runtime context
        contextAppender.append(request.userId());

        return otp.toString();
    }
}
