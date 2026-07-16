package com.nchl.namspacedemo;

import com.nchl.namespacegenerator.generator.NamespaceGenerator;
import com.nchl.namspacedemo.auth.AuthService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    private final AuthService authService;

    public DemoRunner(AuthService authService){
        this.authService=authService;
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(generator.generate("otp", "101"));
        authService.generateOtp(4, "smriti@gmail.com");
    }
}
