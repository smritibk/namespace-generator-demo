package com.nchl.namspacedemo.auth;

import com.nchl.namespacegenerator.generator.NamespaceGenerator;
import org.springframework.stereotype.Component;

@Component
public class AuthKeys {
    private final NamespaceGenerator namespaceGenerator;

    public AuthKeys(NamespaceGenerator namespaceGenerator){
        this.namespaceGenerator=namespaceGenerator;
    }

    public String getRegisterOtpNamespace(String email){
        return namespaceGenerator.generate(
                AuthKey.REGISTRATION.value(),
                AuthKey.USER.value(),
                email,
                AuthKey.OTP.value()
        );
    }
}
