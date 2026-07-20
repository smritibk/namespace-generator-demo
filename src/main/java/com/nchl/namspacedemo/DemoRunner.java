package com.nchl.namspacedemo;

import com.nchl.namspacedemo.auth.Logout;
import com.nchl.namspacedemo.auth.RegisterRequest;
import com.nchl.namspacedemo.auth.RegistrationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    private final RegistrationService registrationService;
    private final Logout logout;

    public DemoRunner(RegistrationService registrationService, Logout logout){
        this.registrationService=registrationService;
        this.logout=logout;
    }


    @Override
    public void run(String... args) throws Exception {
        RegisterRequest request=new RegisterRequest(
                "smriti@gmail.com",
                "smriti@123"
        );

//        logout.calculateMaxSize(request);
        registrationService.generateOtp(request);
    }
}
