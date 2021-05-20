package com.compasso.error;

public abstract class NotFoundException extends RuntimeException {
    public NotFoundException(final String message) {
        super(message);
    }}