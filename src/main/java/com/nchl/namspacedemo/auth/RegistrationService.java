package com.nchl.namspacedemo.auth;

import com.nchl.namespacegenerator.annotation.NamespaceContext;
import com.nchl.namespacegenerator.annotation.NamespaceResource;
import com.nchl.namespacegenerator.generator.NamespaceGenerator;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

@Service
public class RegistrationService {

    private static String DIGITS = "0123456789";

    private static final SecureRandom RANDOM=new SecureRandom();

    private final NamespaceGenerator namespaceGenerator;

    public RegistrationService(NamespaceGenerator namespaceGenerator){
        this.namespaceGenerator=namespaceGenerator;
    }

    @NamespaceContext({"auth", "otp"})
    public void generateOtp(RegisterRequest request){
        StringBuilder otp=new StringBuilder();

        for (int i=0; i<6; i++){
            int randomIndex=RANDOM.nextInt(DIGITS.length());

            otp.append(DIGITS.charAt(randomIndex));
        }

        String namespace = namespaceGenerator.generate(request);

        Map<String, String> otpCache=new HashMap<>();

        otpCache.put(namespace,otp.toString());

        System.out.println(otpCache);
    }
}
