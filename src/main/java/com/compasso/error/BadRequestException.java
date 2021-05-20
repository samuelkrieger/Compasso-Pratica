package com.compasso.error;

public abstract class BadRequestException extends RuntimeException {
    public BadRequestException(final String message) {
        super(message);
    }
}