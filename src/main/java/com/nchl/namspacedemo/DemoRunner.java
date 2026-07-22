package com.nchl.namspacedemo;

import com.nchl.namspacedemo.auth.RegisterRequest;
import com.nchl.namspacedemo.auth.RegistrationService;
import com.nchl.namspacedemo.auth.VerificationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    private final RegistrationService registrationService;
    private final VerificationService verificationService;

    public DemoRunner(
            RegistrationService registrationService,
            VerificationService verificationService) {
        this.registrationService = registrationService;
        this.verificationService=verificationService;
    }


    @Override
    public void run(String... args) throws Exception {
        RegisterRequest request = new RegisterRequest(
                "smriti@gmail.com",
                "smriti@123"
        );

        String otp = registrationService.generateOtp(request);
        verificationService.verifyOtp(otp);

    }
}
