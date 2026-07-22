package com.nchl.namspacedemo.auth;

import com.nchl.namespacegenerator.annotation.NamespaceContext;
import com.nchl.namespacegenerator.generator.NamespaceGenerator;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class VerificationService {

    private final NamespaceGenerator namespaceGenerator;

    public VerificationService(NamespaceGenerator namespaceGenerator){
        this.namespaceGenerator=namespaceGenerator;
    }

    @NamespaceContext({"verify", "otp"})
    public void verifyOtp(String otp) {
        String namespace = namespaceGenerator.generate();

        Map<String, String> otpCache = new HashMap<>();

        otpCache.put(namespace, otp);

        System.out.println(otpCache);
    }
}
