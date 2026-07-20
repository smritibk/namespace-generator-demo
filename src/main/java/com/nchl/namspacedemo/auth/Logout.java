package com.nchl.namspacedemo.auth;

import com.nchl.namespacegenerator.annotation.NamespaceContext;
import com.nchl.namespacegenerator.generator.NamespaceGenerator;
import org.springframework.stereotype.Service;

@Service
public class Logout {
    private final NamespaceGenerator namespaceGenerator;

    public Logout(NamespaceGenerator namespaceGenerator){
        this.namespaceGenerator=namespaceGenerator;
    }

    @NamespaceContext({"storage-service", "cloud", "maxsize"})
    public String calculateMaxSize(RegisterRequest request){
        String namespace=namespaceGenerator.generate(request);
        System.out.println(namespace);
        return namespace;
    }
}
