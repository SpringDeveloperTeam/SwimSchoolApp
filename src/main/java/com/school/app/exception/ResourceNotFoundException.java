package com.school.app.exception;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(Long resource) {
        super("Resource ".concat(String.valueOf(resource)).concat(" Not found"));
    }

    public ResourceNotFoundException(String resource) {
        super("Resource ".concat(resource).concat(" Not found"));
    }
}
