package com.nchl.namspacedemo.auth;

import com.nchl.namespacegenerator.annotation.NamespaceId;
import com.nchl.namespacegenerator.annotation.NamespaceResource;

//@NamespaceResource({"register"})
public record RegisterRequest(

        @NamespaceId(order = 1)
        String userId,
        String password
) {
}
