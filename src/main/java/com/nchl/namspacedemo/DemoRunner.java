package com.nchl.namspacedemo;

import com.nchl.namspacedemo.auth.RegisterRequest;
import com.nchl.namspacedemo.auth.RegistrationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    private final RegistrationService registrationService;

    public DemoRunner(RegistrationService registrationService){
        this.registrationService=registrationService;
    }


    @Override
    public void run(String... args) throws Exception {
        RegisterRequest request=new RegisterRequest(
                "123-123-123",
                "smriti@123"
        );

        registrationService.generateOtp(request);
    }
}
